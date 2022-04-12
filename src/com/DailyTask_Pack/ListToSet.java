package com.DailyTask_Pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
	public static void main(String[] args) {
		//creating List
		//allows Duplicate
		List<String> list=new ArrayList<String>();
		list.add("Oracle");
		list.add("Ruby");
		list.add("Oracle");
		System.out.println("List"+list);
		//create set with list create above
		//not allow duplicate
		Set<String> set=new HashSet<String>(list);
		System.out.println("set" +set);
		
			
		
	}

}
