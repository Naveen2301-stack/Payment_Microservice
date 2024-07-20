package com.scaler.controllers;

import com.razorpay.RazorpayException;
import com.scaler.dtos.IntiatePaymentRequestDto;
import com.scaler.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }
    // this method et order id as input
    @PostMapping("/")
    public String initiatePayment(@RequestBody IntiatePaymentRequestDto requestDto) throws RazorpayException
    {
        return paymentService.intiatePayment(
                requestDto.getOrderId(),
                requestDto.getName(),
                requestDto.getAmount()
        );
    }
}
