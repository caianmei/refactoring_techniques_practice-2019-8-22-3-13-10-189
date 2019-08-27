package com.tws.refactoring.extract_variable;

public class PriceCalculator {
	private double getBasePrice(int quantity, int itemPrice) {
		return quantity * itemPrice;
	}
	
	private int getOutExcessCount(int quantity) {
		 int excessCount = 500;
		return  Math.max(0, quantity - excessCount);
	}
	
	private double getDiscount(int excessCountQuantity,int itemPrice) {
		double discount = 0.05;
		return excessCountQuantity * itemPrice * discount;
	}
	
	private double getShippingCost(int quantity,int itemPrice) {
		double unitShippingCost = 0.1;
		double maxShippingCost = 100;
		return Math.min(quantity * itemPrice * unitShippingCost, maxShippingCost);
	}
	
	private double getFinalyPrice(double basePrice,double discount,double shppingCost) {
		return basePrice - discount + shppingCost;	
	}
    double getPrice(int quantity, int itemPrice) {
    	double basePrice = getBasePrice(quantity, itemPrice);
    	double discount = getDiscount(getOutExcessCount(quantity), itemPrice);
    	double shppingCost = getShippingCost(quantity, itemPrice);
        return getFinalyPrice(basePrice, discount, shppingCost);
    }
}
