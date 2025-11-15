package com.meybise.array;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString
public class Employee {

	
	
	private int id;
    private String email;
    private String fname;
    private String lname;
    private String department;
    private int rollNumber;
    private String subject;
    private int classesAttended;
    private double attendance;

    public Employee(int id, String email, String fname, String lname, String department, 
                    int rollNumber, String subject, int classesAttended, double attendance) {
        this.id = id;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.rollNumber = rollNumber;
        this.subject = subject;
        this.classesAttended = classesAttended;
        this.attendance = attendance;
    }

    public String getFname() {
        return fname;
    }
	 
}
