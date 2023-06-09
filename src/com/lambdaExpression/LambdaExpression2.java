package com.lambdaExpression;

//Example 2: Create a method that takes a lambda expression as a parameter:

interface StringFunction{
	String run(String str);
}
public class LambdaExpression2 {

	public static void main(String[] args) {
		StringFunction func = (s) -> s+"!";
		StringFunction fun = (s) -> s+"?";
		printFormatted("Hello ", func);
		printFormatted("Hello ", fun);
	}
	public static void printFormatted(String str,StringFunction func) {
		String result  =  func.run(str);
		System.out.println(result);
	}
}
