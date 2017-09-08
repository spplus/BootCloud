package com.spplus.dbservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spplus.bootcm.bean.UserInfo;
import com.spplus.bootcm.logger.SpLogger;
import com.spplus.dbservice.service.TestService;

@RestController
public class UserController {

	@Autowired
	private DiscoveryClient client;
	
	@Autowired
	TestService		testS;
	
	@RequestMapping("/finduser")
    public UserInfo finduser(@RequestParam String username) {

		SpLogger.debug("finduser:"+username);
		return testS.findByUsername(username);
    }
	
	@RequestMapping("/test")
	public void test(){
		SpLogger.debug("test transaction");
		try {
			testS.insertTest(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
