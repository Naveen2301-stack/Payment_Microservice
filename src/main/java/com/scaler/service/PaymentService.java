package com.scaler.service;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    public String intiatePayment(Long orderId,String name,double amount) throws RazorpayException;
}
