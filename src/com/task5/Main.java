package com.task5;

interface Calculator {
	int calculate(int a,int b);
	
	default void printResult(int result) {
		System.out.println("Result : "+result);
	}
}

class Addition implements Calculator{
	@Override
	public int calculate(int a, int b) {
		return a+b;
	}
	
}
class Substraction implements Calculator{
	@Override
	public int calculate(int a, int b) {
		return a-b;
	}
}
public class Main {

	public static void main(String[] args) {
		Calculator add =  new Addition();
		int sum = add.calculate(5, 9);
		add.printResult(sum);
		
		Calculator subs = new Substraction();
		int minus = subs.calculate(7, 4);
		subs.printResult(minus);
	}
}
