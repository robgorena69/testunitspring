package com.gorena.TestProject.Payments;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {

 
    private PaymentDone paymentGateway;
    private  PaymentProcessor paymentProcessor;


    @BeforeEach
    private void setup() {
         paymentGateway = Mockito.mock(PaymentDone.class);
         paymentProcessor = new PaymentProcessor(paymentGateway);
    }


    @Test
    void pagoEsCorrecto(){
      
        Mockito.when(paymentGateway.requestPaymaent(Mockito.any()))
        .thenReturn(new PaymentResponse(PaymentStatus.RECHAZADO));
        
      
        assertFalse(paymentProcessor.makePayment(100));
    }
    
    
    @Test
    void pagoEsIncorrecto() {
          Mockito.when(paymentGateway.requestPaymaent(Mockito.any()))
        .thenReturn(new PaymentResponse(PaymentStatus.PAGADO));
        
          assertTrue(paymentProcessor.makePayment(2500));
    }
}
