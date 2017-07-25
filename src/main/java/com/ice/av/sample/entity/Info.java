package com.ice.av.sample.entity;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Info {
	
    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(Info.class);

    private String info = "This is a test info...";
    
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) { 
		this.info = info;
	}

	public Info withInfo(String info) { 
		this.info = info;
		return this;
	}

	public String getTimestamp() {
		return new Date().toString();
	}

	public void setTimestamp(String timestamp) {
	}

	@Override
	public String toString() {
		return "Info [info=" + info + "]";
	}
    
}
