package com.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.java.math.MathCalculations;

public class MathTest {

	@Test(timeout=2000)
	public void addTest() {
		MathCalculations mathCalc = new MathCalculations();
		assertEquals("Something went wrong!", 4, mathCalc.add(2, 2));
	}
	
	@Test
	@Ignore
	public void subtractTest() {
		
	}

}
