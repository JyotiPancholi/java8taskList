package com.flateMap.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlateMapDemo2 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("akash","kripa","khyati");
		List<String> list2 = Arrays.asList("lovisha","gunika","jyoti");
		List<String> list3 = Arrays.asList("nimit","vishal");
		List<String> list4 = Arrays.asList("hvdjbvjh","gvshdv","gvhgv");
		List<String> list5 = Arrays.asList("uyrtfgf","vscgsc","gfdcscg");
		List<List<String>> allList = new ArrayList<List<String>>();   
		allList.add(list1);
		allList.add(list2);
		allList.add(list3);
		allList.add(list4);
		allList.add(list5);
		List<String> list = new ArrayList<String>();
		for (List<String> get : allList) {
			for (String getby : get) {
				list.add(getby);
			}
		}
		System.out.println("List Before Applying mapping and Flattening: \n");  
		//prints stream before applying the flatMap() method  
		System.out.println(list);  
		System.out.println();  
//--------------------------------------------------------------------------------------------
		//creats a stream of elemnts using flatMap()  
		List<String> flatMapList = allList.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());   
		System.out.println("List After Applying Mapping and Flattening Operation: \n");   
		//prints the new stream that we get after applying mapping and flattening   
		System.out.println(flatMapList);    
	}
}
