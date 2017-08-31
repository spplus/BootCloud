package com.spplus.dbservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spplus.bootcm.bean.UserInfo;
import com.spplus.bootcm.logger.SpLogger;
import com.spplus.dbservice.service.UserInfoService;

@RestController
public class UserController {

	@Autowired
	UserInfoService userService;
	
	@RequestMapping("/finduser")
    public UserInfo finduser(@RequestParam String username) {

		SpLogger.debug("finduser:"+username);
		return userService.findByUsername(username);
    }
}
