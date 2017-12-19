package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDoubleFloat {
	
	double doubleNum = 1.22;
	double doubleNum2 = 1.23;

	@Test
	public void doubleEqualityTest() {
		assertEquals("Double numbers not equal", doubleNum, doubleNum2, 0.02);
	}

}
