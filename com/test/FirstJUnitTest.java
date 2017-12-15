package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.MyCalcObject;

public class FirstJUnitTest {
	int x = 2;
	int y = 5;

	// test case
	@Test
	public void test() {
		assertTrue(x == (1 + 1));
	}
	
	@Test
	public void test2() {
		assertTrue(y == (4 + 1));
	}
	
	@Test
	public void add(){
		MyCalcObject myCalcObj = new MyCalcObject();
		int result = myCalcObj.basicAdd(2, 2);
		assertEquals(4, result);
	}
	
	@Test 
	public void divide(){
		MyCalcObject myCalcObj = new MyCalcObject();
		int result = myCalcObj.basicDivide(12, 4);
		assertEquals(3, result);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero(){
		MyCalcObject myCalcObj = new MyCalcObject();
		int result = myCalcObj.basicDivide(12, 0);
	}

}
