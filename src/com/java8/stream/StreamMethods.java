package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMethods {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList() ;
		list.add(111);
		list.add(12);
		list.add(31);
		list.add(4);
		list.add(5);
		
//		list.stream().map(n->n*2).forEach(System.out::println);
		
	
		
		
//		list.stream().filter(n->n%2==0).forEach(System.out::println);	
		
		list.stream().sorted().forEach(System.out::println);
	}

}
