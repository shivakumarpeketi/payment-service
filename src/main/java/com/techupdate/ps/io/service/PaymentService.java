package com.techupdate.ps.io.service;

import com.techupdate.ps.io.entity.Payment;
import com.techupdate.ps.io.respository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    @Lazy
    private PaymentRepository paymentRepository;

    public Payment payment(Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(getPaymentStatus());
        return paymentRepository.save(payment);
    }

    private  String getPaymentStatus(){
        //usually a third party liek paytm/phonpe will send this status
        return new Random().nextBoolean() ? "Success" : "Fail";
    }
}
