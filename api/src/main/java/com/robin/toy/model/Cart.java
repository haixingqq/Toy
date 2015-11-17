package com.robin.toy.model;

import java.io.Serializable;

/**
 * 
 * @author Robin
 *
 */
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	public String skuid;
	public Integer skunum;
	public String userid;

	public String getSkuid() {
		return skuid;
	}

	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}

	public Integer getSkunum() {
		return skunum;
	}

	public void setSkunum(Integer skunum) {
		this.skunum = skunum;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
