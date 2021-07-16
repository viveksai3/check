package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.PassengerInfo;
import com.example.demo.dao.PaymentRepo;
import com.example.demo.dto.BookingRequest;
import com.example.demo.entity.PaymentInfo;
import com.example.demo.utils.BalanceCheck;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo paymentRepo;

	public PaymentInfo paymentCheck(BookingRequest request) {
		PassengerInfo passInfo = request.getPassengerInfo();
		PaymentInfo payInfo = request.getPaymentInfo();
		BalanceCheck.balcCheck(payInfo.getAccountNo(), passInfo.getFare());
		payInfo.setPassengerId(passInfo.getPassId());
		payInfo.setAmount(passInfo.getFare());
		payInfo.setStatus("Success");
		return paymentRepo.save(payInfo);

	}
}
