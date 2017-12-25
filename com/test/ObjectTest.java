package com.test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

import java.io.Serializable;

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
	
	@Test
	public void nullTest(){
		String testString = null;
		
		assertThat("Null value expected!", testString, nullValue());
		
		
	}
	
	@Test
	public void notNullTest(){
		String testString = "";
		
		assertThat("Not Null value expected!", testString, notNullValue());
		
	}
	
	@Test
	public void isTest(){
		String testString = "test";
		
		assertThat("Tested instance of", testString, instanceOf(Serializable.class));
		assertThat("Tested is A", testString, isA(Serializable.class));		
		
	}	
	
	@Test
	public void contains(){
		String testString = "(this is a test, of a string.";
		
		assertThat("Tested all of", testString, allOf(startsWith("("),
															containsString(","),
															endsWith(".")));
		
	}	
	
}
