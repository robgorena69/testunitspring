package com.gorena.TestProject.Descuentos;

import java.util.*;


public class PriceCalculator {

    List<Double> prices = new ArrayList<>();
    List<Double> descuentos = new ArrayList<>();


    public double getTotal(){
        double precios = prices.stream().mapToDouble(Double::doubleValue).sum();
        double disc = descuentos.stream().mapToDouble(Double::doubleValue).sum();
        if (precios-disc < 0) {
            return 0;
        }  else  {
            return Double.valueOf(precios-disc);    
        } 
    }

    public void addPrice(double d) {
        prices.add(d);
    }

    public void setDiscount(double i) {
        descuentos.add(i);
    }
    
}
