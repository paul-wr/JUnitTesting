package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectTest {
	String s1 = "test";
	String s2 = new String("test");

	@Test
	public void testSame() {
		assertSame("Not the same object!", s1, s2);
	}
	
	@Test
	public void testEquals() {
		assertEquals(s1, s2);
	}	
	
	@Test
	public void testNotSame() {
		assertNotSame("Not the same!", s1, s2);
	}
}
