package com.DailyTask_Pack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfCharacter {
	public static void main(String[] args) {
		String s="paulinammukutty";
		char[] character=s.toCharArray();
		Map<Character ,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char c :character)
		{
			if(map.containsKey(c))
			{
				Integer value=map.get(c);
				map.put(c, value+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		Set<Entry<Character,Integer>>entryset=map.entrySet();
		System.out.println("****Repeated Characters are****");
		for(Entry<Character,Integer> entry:entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry);
			}
		}
		
	}

}
