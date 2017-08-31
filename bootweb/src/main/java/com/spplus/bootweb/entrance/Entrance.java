package com.spplus.bootweb.entrance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spplus.bootweb.provider.DbServiceClient;

@Component
public class Entrance {
	
	
	@Autowired
	private DbServiceClient 	dbservice;

	public DbServiceClient getDbservice() {
		return dbservice;
	}
	
}
