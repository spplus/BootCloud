package com.spplus.dbservice.druid;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.spplus.dbservice.dynamicds.DynamicDataSource;


//@Configuration
//@ConditionalOnClass(com.alibaba.druid.pool.DruidDataSource.class)
//@ConditionalOnClass(com.atomikos.jdbc.AtomikosDataSourceBean.class)
//@ConditionalOnProperty(name = "spring.datasource.type", havingValue = "com.atomikos.jdbc.AtomikosDataSourceBean", matchIfMissing = true)
//@ServletComponentScan("com.spplus.filters")
public class DruidDataSourceConfig {

    private Logger logger = LoggerFactory.getLogger(DruidDataSourceConfig.class);

    //@Autowired
    //private DruidDataSourceProperty druidDataSourceProperty;
    
    //@Autowired
    //private DruidDataSourceProperty2 druidDataSourceProperty2;
    
    @Autowired
    private Db1Property dp1;
    
    @Autowired
    private Db2Property dp2;
    

    public DataSource createDataSource(DataSourceProperty dp){
    	AtomikosDataSourceBean datasource = new AtomikosDataSourceBean();
    
    
    	datasource.setUniqueResourceName(dp.getDbname());
    	datasource.setXaDataSourceClassName(dp.getDriverClassName());
    	Properties p = new Properties();
    	p.setProperty ( "user" , dp.getUsername());
    	p.setProperty ( "password" , dp.getPassword());
    	p.setProperty ( "URL" , dp.getUrl());
    	datasource.setXaProperties (p);
    	datasource.setTestQuery(dp.getValidationQuery());
    	datasource.setMaxPoolSize(dp.getMaxActive());
    	datasource.setMinPoolSize(dp.getMinIdle());
    	datasource.setMaxIdleTime(dp.getMaxWait());
    	
    	/*
    	DruidDataSource datasource = new DruidDataSource();
    	
        datasource.setUrl(dp.getUrl());
        datasource.setUsername(dp.getUsername());
        datasource.setPassword(dp.getPassword());
        datasource.setDriverClassName(dp.getDriverClassName());
        datasource.setInitialSize(dp.getInitialSize());
        datasource.setMinIdle(dp.getMinIdle());
        datasource.setMaxActive(dp.getMaxActive());
        // 配置获取连接等待超时的时间
        datasource.setMaxWait(dp.getMaxWait());
        // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        datasource.setTimeBetweenEvictionRunsMillis(dp.getTimeBetweenEvictionRunsMillis());
        // 配置一个连接在池中最小生存的时间，单位是毫秒
        datasource.setMinEvictableIdleTimeMillis(dp.getMinEvictableIdleTimeMillis());
        datasource.setValidationQuery(dp.getValidationQuery());
        datasource.setTestWhileIdle(dp.isTestWhileIdle());
        datasource.setTestOnBorrow(dp.isTestOnBorrow());
        datasource.setTestOnReturn(dp.isTestOnReturn());
        datasource.setPoolPreparedStatements(dp.isPoolPreparedStatements());
        datasource.setMaxPoolPreparedStatementPerConnectionSize(dp.getMaxPoolPreparedStatementPerConnectionSize());
        datasource.setUseGlobalDataSourceStat(dp.isUseGlobalDataSourceStat());
        try {
            datasource.setFilters(dp.getFilters());
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        datasource.setConnectionProperties(dp.getConnectionProperties());
		*/
        return datasource;
    }

    /* 由于可能存在多个数据源，采用上面的更加简洁的编码方式.
    @Bean     //声明其为Bean实例
    public DataSource dataSource1(){
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(druidDataSourceProperty.getUrl());
        datasource.setUsername(druidDataSourceProperty.getUsername());
        datasource.setPassword(druidDataSourceProperty.getPassword());
        datasource.setDriverClassName(druidDataSourceProperty.getDriverClassName());

        datasource.setInitialSize(druidDataSourceProperty.getInitialSize());
        datasource.setMinIdle(druidDataSourceProperty.getMinIdle());
        datasource.setMaxActive(druidDataSourceProperty.getMaxActive());
        // 配置获取连接等待超时的时间
        datasource.setMaxWait(druidDataSourceProperty.getMaxWait());
        // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        datasource.setTimeBetweenEvictionRunsMillis(druidDataSourceProperty.getTimeBetweenEvictionRunsMillis());
        // 配置一个连接在池中最小生存的时间，单位是毫秒
        datasource.setMinEvictableIdleTimeMillis(druidDataSourceProperty.getMinEvictableIdleTimeMillis());
        datasource.setValidationQuery(druidDataSourceProperty.getValidationQuery());
        datasource.setTestWhileIdle(druidDataSourceProperty.isTestWhileIdle());
        datasource.setTestOnBorrow(druidDataSourceProperty.isTestOnBorrow());
        datasource.setTestOnReturn(druidDataSourceProperty.isTestOnReturn());
        datasource.setPoolPreparedStatements(druidDataSourceProperty.isPoolPreparedStatements());
        datasource.setMaxPoolPreparedStatementPerConnectionSize(druidDataSourceProperty.getMaxPoolPreparedStatementPerConnectionSize());
        datasource.setUseGlobalDataSourceStat(druidDataSourceProperty.isUseGlobalDataSourceStat());
        try {
            datasource.setFilters(druidDataSourceProperty.getFilters());
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        datasource.setConnectionProperties(druidDataSourceProperty.getConnectionProperties());

        return datasource;
    }
    
    @Bean     //声明其为Bean实例
    public DataSource dataSource2(){
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(druidDataSourceProperty2.getUrl());
        datasource.setUsername(druidDataSourceProperty2.getUsername());
        datasource.setPassword(druidDataSourceProperty2.getPassword());
        datasource.setDriverClassName(druidDataSourceProperty2.getDriverClassName());

        datasource.setInitialSize(druidDataSourceProperty2.getInitialSize());
        datasource.setMinIdle(druidDataSourceProperty2.getMinIdle());
        datasource.setMaxActive(druidDataSourceProperty2.getMaxActive());
        // 配置获取连接等待超时的时间
        datasource.setMaxWait(druidDataSourceProperty2.getMaxWait());
        // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        datasource.setTimeBetweenEvictionRunsMillis(druidDataSourceProperty2.getTimeBetweenEvictionRunsMillis());
        // 配置一个连接在池中最小生存的时间，单位是毫秒
        datasource.setMinEvictableIdleTimeMillis(druidDataSourceProperty2.getMinEvictableIdleTimeMillis());
        datasource.setValidationQuery(druidDataSourceProperty2.getValidationQuery());
        datasource.setTestWhileIdle(druidDataSourceProperty2.isTestWhileIdle());
        datasource.setTestOnBorrow(druidDataSourceProperty2.isTestOnBorrow());
        datasource.setTestOnReturn(druidDataSourceProperty2.isTestOnReturn());
        datasource.setPoolPreparedStatements(druidDataSourceProperty2.isPoolPreparedStatements());
        datasource.setMaxPoolPreparedStatementPerConnectionSize(druidDataSourceProperty2.getMaxPoolPreparedStatementPerConnectionSize());
        datasource.setUseGlobalDataSourceStat(druidDataSourceProperty2.isUseGlobalDataSourceStat());
        try {
            datasource.setFilters(druidDataSourceProperty2.getFilters());
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        datasource.setConnectionProperties(druidDataSourceProperty2.getConnectionProperties());

        return datasource;
    }
    */
    @Bean
    @Primary 	//在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        
        dp1.setDbname("db1");
        dp2.setDbname("db2");
        
        // 创建数据源
        DataSource db1 = createDataSource(dp1);
        DataSource db2 = createDataSource(dp2);
        
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(db1);

        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap(5);
        dsMap.put("db1", db1);
        dsMap.put("db2", db2);

        dynamicDataSource.setTargetDataSources(dsMap);

        return dynamicDataSource;
    }
    
    
    
//    // 配置Druid监控的StatViewServlet和WebStatFilter
//    @Bean
//    public ServletRegistrationBean druidServlet() {
//    	logger.info("init Druid Servlet Configuration ");
//      ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
//      servletRegistrationBean.setServlet(new StatViewServlet());
//      servletRegistrationBean.addUrlMappings("/druid/*");
//      Map<String, String> initParameters = new HashMap<String, String>();
//      initParameters.put("loginUsername", "admin");// 用户名
//      initParameters.put("loginPassword", "admin");// 密码
//      initParameters.put("resetEnable", "false");// 禁用HTML页面上的“Reset All”功能
//      initParameters.put("allow", ""); // IP白名单 (没有配置或者为空，则允许所有访问)
//      //initParameters.put("deny", "192.168.20.38");// IP黑名单 (存在共同时，deny优先于allow)
//      servletRegistrationBean.setInitParameters(initParameters);
//      return servletRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//      FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//      filterRegistrationBean.setFilter(new WebStatFilter());
//      filterRegistrationBean.addUrlPatterns("/*");
//      filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//      return filterRegistrationBean;
//    }
}  