package com.example.bean;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PassengerInfo {

	private Long passId;
	private String name;
	private String address;
	private String mobilenum;
	private String date;
	private String from;
	private String to;
	private Double fare;
	public PassengerInfo() {
		
	}
	
	public PassengerInfo(Long passId, String name, String address, String mobilenum, String date, String from, String to,
			Double fare) {
		super();
		this.passId = passId;
		this.name = name;
		this.address = address;
		this.mobilenum = mobilenum;
		this.date = date;
		this.from = from;
		this.to = to;
		this.fare = fare;
	}

	public Long getPassId() {
		return passId;
	}
	public void setPassId(Long passId) {
		this.passId = passId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	
	
	
}
