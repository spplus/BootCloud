package com.spplus.dbservice.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * 配置文件读取类。子类的配置文件读取的key不同，配置项都是相同的。在基类中实现配置项读取，子类中指定不同的key.
 * 
 * @author yls
 * 
 *
 */

@Component
@PropertySource("classpath:database.properties")
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class Db1Property extends DataSourceProperty{

}
