package com.gorena.TestProject.Payments;

public interface PaymentGateway {

    PaymentResponse requestPaymaent(PaymentRequest request);
    
}
