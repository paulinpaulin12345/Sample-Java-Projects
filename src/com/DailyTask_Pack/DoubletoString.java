package com.DailyTask_Pack;

public class DoubletoString {
	public static void main(String[] args) {
		double a=222.34;
		String str=String.valueOf(a);
		System.out.println("Using ValueOf:"+str);
	
		String str2=Double.toString(a);
		System.out.println("Using to String:"+str2);
		
		
	}

}
