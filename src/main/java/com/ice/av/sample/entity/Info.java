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

	public Date getTimestamp() {
		return new Date();
	}

	public void setTimestamp(Date timestamp) {
	}

	@Override
	public String toString() {
		return "Info [info=" + info + "]";
	}
    
}