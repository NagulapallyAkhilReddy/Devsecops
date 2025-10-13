package com.nt.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSumWithPositiveValues() {
    	int x=10;
    	int y=20;
    	int expected=30;
    	//final result
    	Arithmetic ar=new Arithmetic();
    	int actual=ar.sum(x,y);
    	assertEquals(expected,actual);
    	
    }
    
    @Test
    public void testSumWithNegativeValues() {
    	int x=-10;
    	int y=-20;
    	int expected=-30;
    	//final result
    	Arithmetic ar=new Arithmetic();
    	int actual=ar.sum(x,y);
    	assertEquals(expected,actual);
    	
    }
    
    @Test
    public void testSumWithMixedValues() {
    	int x=10;
    	int y=-20;
    	int expected=10;
    	//final result
    	Arithmetic ar=new Arithmetic();
    	int actual=ar.sum(x,y);
    	assertEquals(expected,actual);
    	
    }
    
    @Test
    public void testSumWithZeros() {
    	int x=0;
    	int y=0;
    	int expected=0;
    	//final result
    	Arithmetic ar=new Arithmetic();
    	int actual=ar.sum(x,y);
    	assertEquals(expected,actual);
    	
    }
}
