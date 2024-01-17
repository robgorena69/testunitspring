package com.gorena.TestProject.Descuentos;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    @Test
    void zeroWhenNoPrice(){

        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void totalSumaPrecios(){
        PriceCalculator calculator = new PriceCalculator(); 
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);  
        calculator.addPrice(10.5);  
        
        assertThat(calculator.getTotal()).isEqualTo(36.2);  
    }

    @Test
    void totalSumaPreciosConDescuento(){
        PriceCalculator calculator = new PriceCalculator(); 
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);  
        calculator.addPrice(10.5);  
        
        calculator.setDiscount(25.0);
        calculator.setDiscount(5.0);
        assertThat(calculator.getTotal()).isEqualTo(6.200000000000003);  
    }

    @Test
    void totalSumaPreciosConDescuentoNegativo(){
        PriceCalculator calculator = new PriceCalculator(); 
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);  
        calculator.addPrice(10.5);
        calculator.addPrice(10.0);  
        
        calculator.setDiscount(25.0);
        calculator.setDiscount(50.0);
        assertThat(calculator.getTotal()).isEqualTo(0);  
    }
}
