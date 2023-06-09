package com.lambdaExpression;

import java.util.ArrayList;
import java.util.stream.Collectors;

//Various Forms of Writing Lambda Expression
//Java Lambda Expression with No Parameter:

@FunctionalInterface
interface Sayable {
	public String say();
}

public class LambdaExpression4 {

	public static void main(String[] args) {

		// without lambda expression
		Sayable withoutLambda = new Sayable() {
			@Override
			public String say() {
				return "say something ....but don't use Lambda Expression";
			}
		};
		withoutLambda.say();

		ArrayList<String> list =new ArrayList<>();
		list.add("jiya");
		list.add("fgjhb");
		list.add("hbfjb");
		list.add("abvfjhab");
		System.out.println(list);
	//	list=(ArrayList<String>) list.stream().map(l -> l.concat("lkmj")).collect(Collectors.toList());
//		list=(ArrayList<String>) list.stream().filter(l -> l.contains("i")).collect(Collectors.toList());
		System.out.println(list);
		// without lambda expression
		Sayable withLambda = () -> {
			return "Return something ..using lambda expression";
		};
//		System.out.println(withLambda.say());
	}
}