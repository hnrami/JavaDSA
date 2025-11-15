package com.meybise.daytwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SchoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Teacher> teachers = Arrays.asList(
		            new Teacher(1, "Mr. Smith", 40, "Male", "Mathematics", 80000, 2010),
		            new Teacher(2, "Ms. Johnson", 35, "Female", "Science", 75000, 2015),
		            new Teacher(3, "Mrs. Brown", 45, "Female", "English", 77000, 2012),
		            new Teacher(4, "Mr. White", 50, "Male", "Mathematics", 85000, 2009),
		            new Teacher(5, "Ms. Green", 30, "Female", "History", 72000, 2018),
		            new Teacher(6, "Mr. Black", 38, "Male", "Science", 78000, 2014),
		            new Teacher(7, "Mr. Black", 38, "Male", "Computer", 78000, 2014)
		        );

		 
		 
		 List<String> subjects= teachers.stream().map(Teacher::getSubject).collect(Collectors.toList());
		 
		 System.out.println(subjects.toString());
		 Map<String, Map<String, Long>> generCount=
				 teachers.stream().
				 collect(Collectors.groupingBy(Teacher::getSubject,Collectors.groupingBy(Teacher::getGender,Collectors.counting())));

		 Map<Integer, Long> yearsofCount=
				 teachers.stream().
				 collect(Collectors.groupingBy(Teacher::getYearOfJoining,Collectors.counting()));
		 
		 Map<String, Double> generAge= teachers.stream().collect(Collectors.groupingBy(Teacher::getGender,Collectors.averagingInt(Teacher::getAge)));
				 
//		 Map<String, Map<String, Long>> result = teachers.stream()
//		            .collect(Collectors.groupingBy(
//		                Teacher::getSubject,
//		                Collectors.groupingBy(
//		                    Teacher::getGender,
//		                    Collectors.counting()
//		                )
//		            ));
		 
		 List<String> recentJoiners = teachers.stream().filter(teacher -> teacher.getYearOfJoining()>2015).map(Teacher::getName).collect(Collectors.toList());
		 
		Teacher teacher = teachers.stream().max(Comparator.comparingDouble(Teacher::getSalary)).orElse(null);
		Teacher teachermin = teachers.stream().min(Comparator.comparingDouble(Teacher::getSalary)).orElse(null);
		
		Optional<Teacher> teacherthird = teachers.stream().sorted(Comparator.comparingDouble(Teacher::getSalary)).skip(2).findFirst();
		
		Map<String, Long> subjectCountByTeacher = teachers.stream()
	            .collect(Collectors.groupingBy(Teacher::getName, Collectors.counting()));
		
		List<String> multiSubjectTeachers = subjectCountByTeacher.entrySet().stream()
	            .filter(entry -> entry.getValue() > 1)
	            .map(Map.Entry::getKey)
	            .collect(Collectors.toList());
		
		 System.out.println(generCount.toString());
		 System.out.println(yearsofCount.toString());
		 System.out.println(subjectCountByTeacher.toString());
		 System.out.println(multiSubjectTeachers.toString());
		 
		        School school = new School(teachers);
		        
		        school.solveQueries();
	}

}
