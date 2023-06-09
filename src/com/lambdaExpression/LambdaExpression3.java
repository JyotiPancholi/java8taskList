package com.lambdaExpression;

//	 Write a Java Lambda Expression to Create Thread

public class LambdaExpression3 {

	public static void main(String[] args) {
	    //without lambda, Runnable implementation using anonymous class  
		Runnable runnable =  new Runnable() {

			@Override
			public void run() {
	            System.out.println("Runnable example without lambda exp.");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		//  with lambda Expression
		Runnable runn =  () -> System.out.println("Runnable with Lambda Expression !");
		Thread thread2 = new Thread(runn);
		thread2.start();
	}	
}
