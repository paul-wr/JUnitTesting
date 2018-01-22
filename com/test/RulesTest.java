package com.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class RulesTest {

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule universalTimeout = new Timeout(1000); 
	
	@Test
	public void delayOne() throws InterruptedException {
		Thread.sleep(900);
	}
	
	@Test
	public void delayTwo() throws InterruptedException {
		Thread.sleep(500);
	}
	
	@Test
	public void delayThree() throws InterruptedException {
		Thread.sleep(999);
	}
	
	@Test
	public void delayFour() throws InterruptedException {
		Thread.sleep(1200);
	}

}
