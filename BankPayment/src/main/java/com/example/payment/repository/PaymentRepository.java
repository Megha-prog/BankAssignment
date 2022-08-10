package com.example.payment.repository;

import com.example.payment.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Bank,Integer> {
}
