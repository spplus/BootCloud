package com.spplus.bootweb.provider;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spplus.bootcm.bean.Person;
import com.spplus.bootcm.bean.UserInfo;



@FeignClient("dbservice")
public interface DbServiceProvider {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    List<Person> all();
    
    @RequestMapping(method = RequestMethod.GET, value = "/all2")
    List<Person> all2();
    
    @RequestMapping(method = RequestMethod.GET, value = "/finduser")
    UserInfo findUserByUserName(@RequestParam(value = "username") String username);
}