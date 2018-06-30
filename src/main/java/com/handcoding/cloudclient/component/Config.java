package com.handcoding.cloudclient.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class Config {
	
	@Value("${cloud.config.hellow}")
	private String hellow;

	public String getHellow() {
		return hellow;
	}
	public void setHellow(String hellow) {
		this.hellow = hellow;
	}
}
