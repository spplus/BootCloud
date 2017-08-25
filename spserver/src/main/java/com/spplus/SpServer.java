package com.spplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.spplus.bean.MqConfigBean;

/**
 * Hello world!
 *
 */


@SpringBootApplication
public class SpServer 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     
        SpringApplication.run(SpServer.class, args);
    }
}
