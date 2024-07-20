package com.scaler.service.paymentway;

import com.razorpay.RazorpayException;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public interface PaymentWay {

    String generatePaymentLink(Long orderId,String name,double amount) throws RazorpayException;

    boolean validatePayment(Long orderId);
}
