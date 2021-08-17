package com.techupdate.ps.io.respository;

import com.techupdate.ps.io.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
