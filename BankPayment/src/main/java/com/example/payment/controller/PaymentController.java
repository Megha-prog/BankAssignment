package com.example.payment.controller;

import com.example.payment.entity.Bank;
import com.example.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")

public class PaymentController {
    @Autowired
private PaymentService paymentService;

    @PostMapping("/dodeposit")
    public String doPayment(@RequestBody Bank payment)
    {
        return "Deposit Successfull" +paymentService.doPayment(payment);
    }
    @RequestMapping("/dowithdraw")
   public String dowithdraw(@RequestBody Bank payment)
    {
       return "Withdraw Successfull" +paymentService.dowithdraw(payment);
    }
}
