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
	
	@Test
	public void arrayTest(){
		int[] nums1 = {1, 2, 3};
		int[] nums2 = nums1;
		
		assertEquals("Two array pointers", nums1, nums2);
	}
	
	@Test
	public void arrayTestEquals(){
		int[] nums1 = {1, 2, 3};
		int[] nums2 = {1, 2, 3};
		
		assertEquals("Two array equals", nums1, nums2);
	}
	
	@Test
	public void arrayTestEquals2(){
		int[] nums1 = {1, 2, 3};
		int[] nums2 = {1, 2, 3};
		
		assertArrayEquals("Two array equals", nums1, nums2);
	}
	
	
	
}
