package com.lambdaExpression;

//Java Lambda Expression with Multiple Parameters:

interface Addable{  
    int add(int a,int b);  
}  
public class LambdaExpression6 {

	public static void main(String[] args) {
		 // without lambda expression
		Addable addTo =  new Addable() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		addTo.add(34, 56);
        
		// with lambda expression
		Addable addMulti = (a,b) -> a+b;
		addMulti.add(34, 90);
		
	}
}
