package com.DailyTask_Pack;

public class StringtoInt {
	public static void main(String[] args) {
	String str="1234";
	int sum=0;
	int n1=Integer.parseInt(str);
	System.out.println("using Integer.ParseInt:" +n1);
	int n2=Integer.valueOf(str);
	System.out.println("Using ValueOf:" +n2);
	int n3=new Integer(str).intValue();
	System.out.println("Using NewInteger:"+n3);
	for(int i=0;i<str.length();i++)
	{   sum=sum*10;
		sum=sum+(int)str.charAt(i)-(int)'0';
	}
	System.out.println("another Method:"+sum);
	
			
	
	}
}
