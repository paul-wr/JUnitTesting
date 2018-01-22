package com.test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;


import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assume.*;



@RunWith(Theories.class)
public class TheoriesTest {

	@DataPoints
	public static String[] guitars = {"Les Paul", "Fender", "Hofner"};
	
	@DataPoints
	public static Integer[] integers = {1, 2, 3};
	
	@Theory
	public void someTest(String guitar, Integer number) {
		System.out.println(number+" "+guitar);
		assumeThat(guitar, not(startsWith("F")));
		System.out.println("Continue: \n"+number+" "+guitar);

		
	}	
	

}
