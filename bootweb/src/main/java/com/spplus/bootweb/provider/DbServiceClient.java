package com.spplus.bootweb.provider;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spplus.bootcm.bean.Person;


@FeignClient("dbservice")
public interface DbServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    List<Person> all();
    
    @RequestMapping(method = RequestMethod.GET, value = "/all2")
    List<Person> all2();
}