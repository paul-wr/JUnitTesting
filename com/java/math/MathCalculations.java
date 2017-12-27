package com.java.math;

public class MathCalculations {
	
	public int add(int x, int y){
		
		try{
		Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		return x + y;
	} 
	
	public int subtract(int x, int y){
		return x - y;
	} 
	
	public int multiply(int x, int y){
		return x * y;
	} 
	
	public int divide(int x, int y){
		return 0;
	} 
	
	
}
