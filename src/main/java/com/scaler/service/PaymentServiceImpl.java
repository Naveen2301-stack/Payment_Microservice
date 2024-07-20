package com.scaler.service;

import com.razorpay.RazorpayException;
import com.scaler.service.paymentway.PaymentWay;
import com.scaler.service.paymentway.RazorPaymentWay;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentWay paymentWay;

   public PaymentServiceImpl(@Qualifier("razorpaypayment")PaymentWay paymentWay)
   {
       this.paymentWay = paymentWay;
   }


    @Override
    public String intiatePayment(Long orderId, String name, double amount) throws RazorpayException {
        return paymentWay.generatePaymentLink(
                orderId,
                name,
                amount
        );
    }
}
