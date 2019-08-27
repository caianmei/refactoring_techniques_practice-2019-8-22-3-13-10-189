package com.tws.refactoring.extract_method;

import java.util.Iterator;
import java.util.List;

public class OwingPrinter {
	
	void printBanner() {
		System.out.println("*****************************");
		System.out.println("****** Customer totals ******");
		System.out.println("*****************************");
	}

	double getTatloAmount(Iterator<Order> elements,double tatloAmount) {
		while (elements.hasNext()) {
			Order each = (Order) elements.next();
			tatloAmount += each.getAmount();
		}
		return tatloAmount;
	}
	
	void printDetails(String name,Double tatloAmount) {
		System.out.println("name: " + name);
		System.out.println("amount: " + tatloAmount);
	}
	
	void printOwing(String name, List<Order> orders) {
		Iterator<Order> elements = orders.iterator();
		double tatloAmount = 0.0;
		
		printBanner();
		
		tatloAmount = getTatloAmount(elements, tatloAmount);

		printDetails(name, tatloAmount);
		
	}
}

class Order {
	private final double amount;

	public Order(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
