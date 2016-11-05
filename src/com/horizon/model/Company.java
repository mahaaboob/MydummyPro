package com.horizon.model;

public class Company {

	private long companyID;
	private String address;
	private String city;
	private int enabled;
	private int userID;
	private String createTS;
	private String lastUpdateTS;

	public Company () {

	}

	public Company(int companyID, String address, String city, int enabled, int userID, String createTS, String lastUpdateTS) {
		this.companyID = companyID;
		this.address = address;
		this.city = city;
		this.enabled = enabled;
		this.userID = userID;
		this.createTS = createTS;
		this.lastUpdateTS = lastUpdateTS;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(long companyID) {
		this.companyID = companyID;
	}

	public String getCreateTS() {
		return createTS;
	}

	public void setCreateTS(String createTS) {
		this.createTS = createTS;
	}

	public String getLastUpdateTS() {
		return lastUpdateTS;
	}

	public void setLastUpdateTS(String lastUpdateTS) {
		this.lastUpdateTS = lastUpdateTS;
	}


}
