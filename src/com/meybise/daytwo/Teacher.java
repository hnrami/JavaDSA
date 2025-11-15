package com.meybise.daytwo;

public class Teacher {
	
	 int id;
	    String name;
	    int age;
	    String gender;
	    String subject;
	    double salary;
	    int yearOfJoining;

	    public Teacher(int id, String name, int age, String gender, String subject, double salary, int yearOfJoining) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.subject = subject;
	        this.salary = salary;
	        this.yearOfJoining = yearOfJoining;
	    }

	    // Getters and toString method for easy printing
	    public String getName() { return name; }
	    public String getGender() { return gender; }
	    public String getSubject() { return subject; }
	    public double getSalary() { return salary; }
	    public int getYearOfJoining() { return yearOfJoining; }
	    public int getAge() { return age; }
	    @Override
	    public String toString() {
	        return String.format("Teacher{id=%d, name='%s', age=%d, gender='%s', subject='%s', salary=%.2f, yearOfJoining=%d}",
	                id, name, age, gender, subject, salary, yearOfJoining);
	    }

}
