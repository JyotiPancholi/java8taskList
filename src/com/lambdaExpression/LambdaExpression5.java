package com.lambdaExpression;

//Java Lambda Expression with Single Parameter:
@FunctionalInterface
interface PrintHere {
    void print(String msg);
}
public class LambdaExpression5 {

	public static void main(String[] args) {
		 // without lambda expression
		PrintHere printable = new PrintHere() {
           @Override
           public void print(String msg) {
              System.out.println(msg);
           }
        };
        printable.print(" print without lambda Expression");
 
        // with lambda expression
        PrintHere withLambda = (msg) -> System.out.println(msg);
        withLambda.print("print with lambda Expression");
    }
	
}
