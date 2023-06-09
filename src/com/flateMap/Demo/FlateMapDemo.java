package com.flateMap.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlateMapDemo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,5,4,67,8,5,9);
		List<Integer> list2 = Arrays.asList(6,7,7,4,5,8,7,5);
		List<Integer> list3 = Arrays.asList(2,5,8,8,10);
		List<Integer> list4 = Arrays.asList(9,0,9,8,7,5,9);
		List<Integer> list5 = Arrays.asList(4,6,0,8,5,9);
		List<List<Integer>> getList = Arrays.asList(list1,list2,list3,list4,list5);
		System.out.println(getList);
		 List<Integer> flateList  = getList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		 System.out.println(flateList);
	}
}
