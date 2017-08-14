package com.spplus.dbservice.web;

import com.github.pagehelper.Page;
import com.spplus.bootcm.bean.Person;
import com.spplus.dbservice.service.PersonService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
	
	@Autowired
	private DiscoveryClient client;
	
    // 1 Spring Data JPA已自动为你注册bean，所以可自动注入
    @Autowired
    PersonService personService;
    
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping("/save")
    public Person save(@RequestBody Person person) {

        personService.insert(person);

        return person;

    }

    @RequestMapping("/all")
    public List<Person> sort() {

        List<Person> people = personService.findAll();

        return people;
    }
    
    @RequestMapping("/all2")
    public List<Person> sort2() {

        List<Person> people = personService.findAll2();

        return people;

    }
    

    @RequestMapping("/page")
    public Page<Person> page(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize) {

        Page<Person> pagePeople = personService.findByPage(pageNo, pageSize);

        return pagePeople;
    }

   

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
    
}