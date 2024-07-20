package com.scaler.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IntiatePaymentRequestDto {
    private Long orderId;
    private String name;
    //private String phoneNumber;

    private double amount;

}
