package com.aurionpro.model;

public class Country {
	String code;
	String name;
	public int regionId;

	public Country(String code, String name, int regionId) {
		super();
		this.code = code;
		this.name = name;
		this.regionId = regionId;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getRegionId() {
		return regionId;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", regionId=" + regionId + "]";
	}

}
