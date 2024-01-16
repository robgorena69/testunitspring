package com.gorena.TestProject.Payments;

public class PaymentProcessor {
    
    private PaymentGateway paymentGateway;

   
    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    public boolean makePayment(double monto){
        PaymentResponse respuesta = paymentGateway.requestPaymaent(new PaymentRequest(monto));

        return true;
    }

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    

}
