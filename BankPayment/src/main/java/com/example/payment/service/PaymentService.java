package com.example.payment.service;

import com.example.payment.entity.Bank;
import com.example.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public Bank doPayment(Bank payment)
    {
        payment.setTransactionid(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
    public Bank dowithdraw(Bank payment)
    {
        payment.setTransactionid(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
}
