package com.DailyTask_Pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtoMap {
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(1,"Renu",25));
		students.add(new Student(2,"Preethi",27));
		students.add(new Student(3,"Bonkee",29));
		Map<Integer,String>map=new HashMap<Integer,String>();
		for(Student stud:students)
		{
		map.put(stud.getStudentId(), stud.getStudentName());
		}
		System.out.println(map);
		
		
	}

}





