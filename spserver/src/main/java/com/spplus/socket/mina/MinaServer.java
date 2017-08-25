package com.spplus.socket.mina;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spplus.bean.MqConfigBean;
import com.spplus.util.SpLogger;

/**
 * 
 * TCP服务器
 * 
 * @author yls
 *
 * 
 */

public class MinaServer {  
	
  
	public static void start(int server_port){
		
		int PORT = server_port; 
		
		// 服务器端的主要对象  
		IoAcceptor acceptor = new NioSocketAcceptor();  
		
		// 设置Filter链   
		acceptor.getFilterChain().addLast("logger", new LoggingFilter());  
		
		acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(new SpProtocalCodecFactory(Charset.forName("GBK"))));  

		// 设置消息处理类（创建、关闭Session，可读可写等等，继承自接口IoHandler）  
		acceptor.setHandler(new ServerHandler() );  
		
		// 设置接收缓存区大小  
		acceptor.getSessionConfig().setReadBufferSize(2048);  
		acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 10);  
		try {  
			// 服务器开始监听  
			acceptor.bind( new InetSocketAddress(PORT) );  
			
			SpLogger.info("服务器启动成功："+PORT);
		}catch(Exception e){  
			e.printStackTrace();  
		}  
		 
	}

}  


