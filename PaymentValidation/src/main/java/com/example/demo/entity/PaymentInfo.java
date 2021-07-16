package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class PaymentInfo {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2" , strategy = "org.hibernate.id.UUIDGenerator")
	private String paymentId;
	private String cardType;
	private String accountNo;
	private Double amount;
	private Long passengerId;
	private String status;
	public PaymentInfo() {
		
	}
	
	public PaymentInfo(String paymentId, String cardType, String accountNo, Double amount, Long passengerId) {
		super();
		this.paymentId = paymentId;
		this.cardType = cardType;
		this.accountNo = accountNo;
		this.amount = amount;
		this.passengerId = passengerId;
	}

	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
