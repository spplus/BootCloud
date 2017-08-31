package com.spplus.bootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.spplus.bootcm.logger.SpLogger;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BootWeb {

	public static void main(String[] args) {
		SpLogger.info("BootWeb 启动成功.");
		SpringApplication.run(BootWeb.class, args);
	}
}
