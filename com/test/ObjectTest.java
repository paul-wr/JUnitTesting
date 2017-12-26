package com.test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObjectTest {
	String s1 = "test";
	String s2 = new String("test");
	
	// run date setup before tests
	@BeforeClass
	public static void dateSetup(){
		Calendar date = Calendar.getInstance();
		System.out.println("This runs Before class.	");
	}
	
	// run date setup before tests
		@AfterClass
		public static void runAfter(){
			System.out.println("This runs After class.	");
		}
	
	@Before
	public void codeToRunBeforeTests(){
		System.out.println("This runs before each test.");
	}
	
	@After
	public void codeToRunAfterTests(){
		System.out.println("This runs after each test.");
	}


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
	public void arrayTest() {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = nums1;

		assertEquals("Two array pointers", nums1, nums2);
	}

	@Test
	public void arrayTestEquals() {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 1, 2, 3 };

		assertEquals("Two array equals", nums1, nums2);
	}

	@Test
	public void arrayTestEquals2() {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 1, 2, 3 };

		assertArrayEquals("Two array equals", nums1, nums2);
	}

	@Test
	public void nullTest() {
		String testString = null;

		assertThat("Null value expected!", testString, nullValue());

	}

	@Test
	public void notNullTest() {
		String testString = "";

		assertThat("Not Null value expected!", testString, notNullValue());

	}

	@Test
	public void isTest() {
		String testString = "test";
		String[] array = {"a", "b", "c"}; 
		List<String> list = Arrays.asList(array);

		assertThat("Tested instance of", testString, instanceOf(Serializable.class));
		assertThat("Tested is A", testString, isA(Serializable.class));
		
		assertThat("Tested hasItem()", list, hasItems("a", "b"));


	}

	@Test
	public void contains() {
		String testString = "(this is a test, of a string.";

		assertThat("Tested all of", testString, allOf(startsWith("("), containsString(","), endsWith(".")));

		assertThat("Tested all of", testString, anyOf(containsString("("), containsString(","), containsString("?")));
		
		assertThat("Tested all of", testString, either(endsWith("("))
								.or(startsWith("("))
								.and(notNullValue()));


	}
	
	
	@Test
	public void assumeTesing(){
		int i = 1;
		
		assumeThat("Wrong assumption!", i, not(equalTo(1)));
		
	}
	
	@Test
	public void assumeTrueTest(){
		boolean confirm = false;		
		assumeTrue("Wrong assumption!", confirm);
		
	}
	
	@Test
	public void assumeNoExceptionTesing(){
		int y = 2;
		 try {
		    y = y / 10;
		   } catch (ArithmeticException e) {
		     assumeNoException(e);
		   }
		
	}
	
}
