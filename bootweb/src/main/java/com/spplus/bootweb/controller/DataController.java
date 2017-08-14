package com.spplus.bootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spplus.bootcm.bean.Person;
import com.spplus.bootweb.provider.DbServiceClient;



@RestController
public class DataController {

	 @Autowired
	 DbServiceClient computeClient;
	
	 @RequestMapping("/all")
	 public List<Person> all() {
	        return computeClient.all();
	 }
	
	 @RequestMapping("/all2")
	 public List<Person> all2() {
	        return computeClient.all2();
	 }
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.GET)
	 public Integer add() {
		 return computeClient.add(10, 20);
	 }
	  
}