package com.spplus.dbservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spplus.bootcm.bean.UserInfo;
import com.spplus.db.DataSourceSwitch;
import com.spplus.db.MybatisDao;


@Service
public class TestService {

	@Autowired
	MybatisDao			baseDao;
	
	
	public void  insertTest(int i) throws Exception{
	
		DataSourceSwitch.setDataSourceType("db1");
		baseDao.insert("UserInfoMapper.insertUser", "");
		
		
//		Person person = new Person();
//		person.setAddress("abc");
//		person.setId((long)6);
//		person.setName("test");
//		person.setAge(50);
		
//		DataSourceSwitch.setDataSourceType("db2");
//		baseDao.insert("UserInfoMapper.updateUser", "");
		
		
	}
	
	public UserInfo findByUsername(String username){
		
		DataSourceSwitch.setDataSourceType("db1");
		return baseDao.get("UserInfoMapper.findByUsername", username);
	}
}
