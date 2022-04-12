package com.DailyTask_Pack;

public class Encrypt {
	public static void main(String[] args) {
		int key=1;
		String text="AmmuKutty";
		System.out.println(text);
	char[] chars	=text.toCharArray();
	System.out.println("**Encrypt**");
	for(char c:chars) 
	{
		c+=key;//using keys encrypt as +1 means B for A,n for m
		System.out.print(c );
	}
	System.out.println("\n");
	String text1="BnnvLvuuz";
	System.out.println(text1); 
   char[] chars1	=text1.toCharArray();
   System.out.println("**Decrypt**");
	
	for(char c:chars1) 
	{
		c-=1;//using keys encrypt as -1 means A for B
		System.out.print(c );
	}
		
	}

}
