package com.gorena.TestProject.Payments;

public class PaymentResponse {
  
    private PaymentStatus status;

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }
    

    
}
