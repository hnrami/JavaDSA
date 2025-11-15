package com.meybise.daytwo;

import java.util.List;

public class School {
	
	
	List<Teacher> teacherList;

	public School(List<Teacher> teacherList) {
		super();
		this.teacherList = teacherList;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	@Override
	public String toString() {
		return "School [teacherList=" + teacherList + "]";
	}

	public void solveQueries() {
		// TODO Auto-generated method stub
		
		
		
		
	}
	
	

	
	

}
