package com.DailyTask_Pack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class RetriveRepeatWord {
	public static void main(String[] args) {
		String s="peter eats butter butter looks better butter peter eats better";
		String[] words=s.split(" ");
		Map<String ,Integer> map=new LinkedHashMap<String,Integer>();
		for(String s1:words)
		{
			if(map.containsKey(s1))
			{
				Integer value=map.get(s1);
				map.put(s1, value+1);
			}
			else
			{
				map.put(s1, 1);
			}
		}
		System.out.println(map);
		Set<Entry<String,Integer>> entryset=map.entrySet();
		System.out.println("***The Repeated Words*** ");
		for(Entry<String,Integer> entry:entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry);
			}
		}
		
		
				
		
		
	}

}
