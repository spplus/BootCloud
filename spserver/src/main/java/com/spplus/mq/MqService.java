package com.spplus.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.spplus.bean.MqConfigBean;
import com.spplus.util.SpLogger;

/**
 * MQ初始化.
 *
 * @author yuanls
 */

public class MqService {
	
    /**
     * 初始化方法，spring容器启动时调用此方法.
     */
    public static  void start(MqConfigBean mqconfig) {
      
    	SpLogger.info("初始化RocketMq");

        try {
        	
           BusConsumer.subscribe(mqconfig);
           
        } catch (MQClientException e) {
        	SpLogger.error("SFSERVER订阅服务启动失败", e);
        }
    }
}
