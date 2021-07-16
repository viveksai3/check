package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PaymentInfo;

public interface PaymentRepo extends JpaRepository<PaymentInfo, String>{

}
