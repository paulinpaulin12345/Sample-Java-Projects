package com.DailyTask_Pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SettoList {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();//not allow duplicate
		set.add("Java");
		set.add("Oracle");
		set.add("Ruby");
		set.add("Java");
		System.out.println("Set"+set);
		//list too not accept the duplicate
		List<String> list=new ArrayList<String>(set);
		System.out.println("List" +list);
			
		
	}

}
