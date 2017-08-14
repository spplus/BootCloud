package com.spplus.dbservice.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:database.properties")
@ConfigurationProperties(prefix = "spring.datasource.druid.db2")
public class Db2Property  extends DataSourceProperty{

}
