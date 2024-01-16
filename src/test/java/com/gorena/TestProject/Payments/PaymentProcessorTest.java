package com.gorena.TestProject.Payments;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {


    @Test
    void pagoEsIncorrecto() {
        PaymentDone paymentGateway = Mockito.mock(PaymentDone.class);
        Mockito.when(paymentGateway.requestPaymaent(Mockito.any()))
        .thenReturn(new PaymentResponse(PaymentStatus.PAGADO));
        
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        paymentProcessor.makePayment(2500);


    }
}
