package com.techupdate.ps.io.controller;

import com.techupdate.ps.io.entity.Payment;
import com.techupdate.ps.io.service.PaymentService;
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

    @PostMapping("/payments")
    public Payment payment(@RequestBody Payment payment){
        Payment savedPayment = paymentService.payment(payment);
        System.out.println(savedPayment.toString());
        return savedPayment;
    }


}
