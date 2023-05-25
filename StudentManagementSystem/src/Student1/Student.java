package Student1;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
	private String rollno;
	private String fname;
	private String lname;
	private String email;
	private String address;
	private LocalDate dob;
	private Qualification q1;
	private Course c1;
	private double fees;
	private boolean docSubmit;
	
	
	public Student(String rollno, String fname, String lname, String email, String address, LocalDate dob,Qualification q1,Course c1, double fees,
			boolean docSubmit) {
		super();
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.dob = dob;
		this.q1=q1;
		this.c1=c1;
		this.fees = fees;
		this.docSubmit = docSubmit;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	public boolean isDocSubmit() {
		return docSubmit;
	}


	public void setDocSubmit(boolean docSubmit) {
		this.docSubmit = docSubmit;
	}


	public String getRollno() {
		return rollno;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address="
				+ address + ", dob=" + dob + ", fees=" + fees + ", docSubmit=" + docSubmit + "]";
	}
	
	
	
	
}
