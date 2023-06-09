package com.lambdaExpression;

interface Printable{
	public void print(String msg);
}
public class LambdaExpression1 {

	public static void main(String[] args) {
        // without lambda expression
		Printable printable =  new Printable() {
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		printable.print("Funtional interface using annonymous class ....without using lambda expression !");
       
		// without lambda expression
		Printable p = (msg) -> System.out.println(msg);
		p.print("USing lambda expression");
	}
}
