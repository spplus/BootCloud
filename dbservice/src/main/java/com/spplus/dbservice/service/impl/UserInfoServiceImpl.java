package com.spplus.dbservice.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spplus.bootcm.bean.UserInfo;
import com.spplus.dbservice.dynamicds.DS;
import com.spplus.dbservice.mapper.UserInfoMapper;
import com.spplus.dbservice.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
   
	@Autowired
    private UserInfoMapper userInfoMapper;

	@DS("db1")
	@Override
	public UserInfo findByUsername(String username) {
		
		UserInfo user = userInfoMapper.findByUsername(username);
		return user;
	}
   
	
}