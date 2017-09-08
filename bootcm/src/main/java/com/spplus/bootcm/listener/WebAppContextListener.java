package com.spplus.bootcm.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.web.context.support.WebApplicationContextUtils;

import com.spplus.bootcm.logger.SpLogger;
import com.spplus.bootcm.util.Const;

@WebListener
public class WebAppContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
	}
	@Override
	public void contextInitialized(ServletContextEvent event) {
		SpLogger.info("*********************WebAppContextListener contextInitialized.********************");
		Const.WEB_APP_CONTEXT = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
	}

}
