package com.DailyTask_Pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		
	
	String sub[]= {"123","4567","4569"};
	List list=Arrays.asList(sub);
	System.out.println(list);
	List<String> arr=new ArrayList<String>();
	String[] newsub=new String[] {"Ruby","Python"};
	Collections.addAll(arr, newsub);
	System.out.println(arr);
	for (String string : sub) {
		arr.add(string);
		
	}
	System.out.println(arr);
	
	}
}
