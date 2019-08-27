package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        System.out.println("hello");
        assertEquals("hello\r\n", outContent.toString());
    }
    
    @Test
    public void should_print_banner_and_owings_details_when_printOwing_given_name_karroy_and_order_list() {
    	//given
    	String name = "karroy";
    	List<Order> orders = new ArrayList<Order>();
    	orders.add(new Order(11.8));
    	orders.add(new Order(9.21));
    	OwingPrinter owingPrinter = new OwingPrinter();
    	//when
    	owingPrinter.printOwing(name, orders);
    	//then
    	 assertEquals("*****************************\r\n"
    			 + "****** Customer totals ******\r\n"
    			 + "*****************************\r\n"
    			 + "name: karroy\r\n"
    			 + "amount: 21.01\r\n", outContent.toString());
    }
}