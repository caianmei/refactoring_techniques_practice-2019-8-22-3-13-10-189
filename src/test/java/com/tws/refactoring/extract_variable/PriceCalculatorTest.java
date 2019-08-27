package com.tws.refactoring.extract_variable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PriceCalculatorTest {

	@Test
	void should_get_price_is_900_when_get_price_given_quantity_as_100_and_itemPrice_as_1100() {
		//given
		int quantity = 100;
		int itemPrice = 10;
		PriceCalculator priceCalculator = new PriceCalculator();
		//when
		double price = priceCalculator.getPrice(quantity, itemPrice);
		//then
		assertEquals(1100.0d, price);
	}

}
