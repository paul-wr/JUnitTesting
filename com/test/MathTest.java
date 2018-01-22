package com.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.java.math.MathCalculations;

public class MathTest {
	MathCalculations mathCalc = new MathCalculations();

	@Test(timeout=2000)
	public void addTest() {
		assertEquals("Something went wrong!", 4, mathCalc.add(2, 2));
	}
	
	@Test
	public void subtractTest() {
		assertEquals("Something went wrong!", 4, mathCalc.subtract(10, 6));
	}
	
	@Test
	@Ignore
	public void multiplyTest() {
	}

}
