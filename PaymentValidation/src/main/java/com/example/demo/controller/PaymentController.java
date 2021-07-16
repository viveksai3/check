package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookingRequest;
import com.example.demo.entity.PaymentInfo;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/paymentcheck")
	public PaymentInfo paymentCheck(@RequestBody BookingRequest bookingRequest) {
		System.out.println("vivek controller");
		return paymentService.paymentCheck(bookingRequest);
		
	}
	
	@GetMapping("/check")
	public String check() {
		return "check success";
	}
}
