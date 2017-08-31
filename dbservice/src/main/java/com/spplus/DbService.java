package com.spplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.spplus.bootcm.logger.SpLogger;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class DbService {

	public static void main(String[] args) {
		SpLogger.info("DbService 启动成功.");
		SpringApplication.run(DbService.class, args);
	}
}
