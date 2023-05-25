package com.app;

import java.time.LocalDate;
import java.util.Map;

import Student1.Course;
import Student1.Qualification;
import Student1.Student;

public class ValidateStudentAllDetails {
	public static Student validateAll (String rollno, String fname, String lname, String email, String address, String dob,String q1,String c1, double fees,
			boolean docSubmit,Map<String, Student>maps) throws StudentManagementExceptionHandling
	{	
		checkforDuplicates(rollno,maps );
		LocalDate da = validateDob(dob);
		Qualification qua =  validate(q1);
		Course co = validateCourse(c1);
		return new Student(rollno,fname,lname,email,address,da,qua,co,fees,docSubmit);
		
	}
	public static void checkforDuplicates(String id,Map<String, Student>maps ) throws StudentManagementExceptionHandling
	{
		if(maps.containsKey(id))
			throw new StudentManagementExceptionHandling("Duplicate found...");
		System.out.println("DUPLICATE NOT FOUND...");
	}
	
	
	
	public static LocalDate validateDob(String dob) throws StudentManagementExceptionHandling
	{
		LocalDate d1 = LocalDate.parse(dob);
		String d = "2000-01-01";
		LocalDate d2 = LocalDate.parse(d);
		if(d1.isBefore(d2))
			throw new StudentManagementExceptionHandling("Invalid age.....");
		return d1;
		
	}
	
	public static Qualification validate(String q)
	{
		return Qualification.valueOf(q.toUpperCase());
	}
	public static Course validateCourse(String c)
	{
		return Course.valueOf(c.toUpperCase());
	}
	
}
