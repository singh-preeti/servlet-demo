package com.core;

public class Employee {
	String empname;
	int empId;
	String cityname;
	String companyname="Axis Bank";
	public int add()
	{
		int a=10,b=20;
		int c= a+b;
		System.out.println("the addition is = " +c);
		return c;
	}

	public static void main(String[] args) {
		Employee akash = new Employee();
		akash.add();
	}
}
