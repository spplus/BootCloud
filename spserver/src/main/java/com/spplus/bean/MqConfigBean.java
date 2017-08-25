package com.spplus.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
// @PropertySource("classpath:mq.properties")
@ConfigurationProperties(prefix = "mq")
public class MqConfigBean {

	private static final long serialVersionUID = 2L;
	 
    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private  String consumergroupnameCust;
    private  int consumethreadmin;
    private  int consumethreadmax;
    private  int consumemessagebatchmaxsize;
    private  int pullbatchsize;
    public String getConsumergroupnameCust() {
		return consumergroupnameCust;
	}
	public void setConsumergroupnameCust(String consumergroupnameCust) {
		this.consumergroupnameCust = consumergroupnameCust;
	}
	public int getConsumethreadmin() {
		return consumethreadmin;
	}
	public void setConsumethreadmin(int consumethreadmin) {
		this.consumethreadmin = consumethreadmin;
	}
	public int getConsumethreadmax() {
		return consumethreadmax;
	}
	public void setConsumethreadmax(int consumethreadmax) {
		this.consumethreadmax = consumethreadmax;
	}
	public int getConsumemessagebatchmaxsize() {
		return consumemessagebatchmaxsize;
	}
	public void setConsumemessagebatchmaxsize(int consumemessagebatchmaxsize) {
		this.consumemessagebatchmaxsize = consumemessagebatchmaxsize;
	}
	public int getPullbatchsize() {
		return pullbatchsize;
	}
	public void setPullbatchsize(int pullbatchsize) {
		this.pullbatchsize = pullbatchsize;
	}
	public String getNameserver() {
		return nameserver;
	}
	public void setNameserver(String nameserver) {
		this.nameserver = nameserver;
	}
	private  String nameserver;
}
