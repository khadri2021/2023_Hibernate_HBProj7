package com.khadri.hibernate.map;

import java.util.Map;

public class College {

	private int clgId;
	private String clgName;
	private Map<String, String> hods;

	public int getClgId() {
		return clgId;
	}

	public void setClgId(int clgId) {
		this.clgId = clgId;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Map<String, String> getHods() {
		return hods;
	}

	public void setHods(Map<String, String> hods) {
		this.hods = hods;
	}

}
