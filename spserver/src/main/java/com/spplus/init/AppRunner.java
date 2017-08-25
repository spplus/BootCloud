package com.spplus.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spplus.bean.MqConfigBean;
import com.spplus.mq.MqService;
import com.spplus.socket.mina.MinaServer;
import com.spplus.util.SpLogger;

@Component
public class AppRunner implements CommandLineRunner {

	
	@Autowired
	MqConfigBean config;
	
	@Value("${mima.server_port}")
	int port;

	
	public void run(String... args) throws Exception {
		
		SpLogger.debug("AppRunner started."+config.getNameserver());
		
		// 启动mima server
		MinaServer.start(port);
		
		//启动mq订阅
		MqService.start(config);
		
		SpLogger.debug("AppRunner end.");
	
	}
    
}
