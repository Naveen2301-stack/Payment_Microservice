package com.scaler.service.paymentway;

import org.springframework.stereotype.Service;

@Service("stripepayment")
public class StripePaymentWay implements PaymentWay{
    @Override
    public String generatePaymentLink(Long orderId, String name, double amount) {
        return null;
    }

    @Override
    public boolean validatePayment(Long orderId) {
        return false;
    }
}
