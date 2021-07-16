package com.example.demo.dto;

import com.example.bean.PassengerInfo;
import com.example.demo.entity.PaymentInfo;

public class BookingRequest {

	private PassengerInfo passengerInfo;
	private PaymentInfo paymentInfo;
	public BookingRequest() {
		
	}
	public BookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentInfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.paymentInfo = paymentInfo;
	}
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	
	
}
