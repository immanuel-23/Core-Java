package com.aurionpro.model;

public class Countries {
	private String code;
	private String countryName;
	private int countryId;
	
	
	public Countries(String code, String countryName, int countryId) {
		super();
		this.code = code;
		this.countryName = countryName;
		this.countryId = countryId;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public int getCountryId() {
		return countryId;
	}

	@Override
	public String toString() {
		return "Countries [code=" + code + ", countryName=" + countryName + ", countryId=" + countryId + "]";
	}
	
	
	
	
	

}
