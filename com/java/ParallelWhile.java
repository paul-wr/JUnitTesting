package com.java;

import org.junit.Test;

public class ParallelWhile {
	@Test
	public void runWhile(){
		int i = 0;
		while(i++ < 100){
			System.out.println("While: "+i);
		}
	}
}
