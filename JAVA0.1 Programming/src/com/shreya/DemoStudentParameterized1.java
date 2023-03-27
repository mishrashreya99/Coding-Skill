package com.shreya;

public class DemoStudentParameterized1
{

	   String name;
	   int age;
	   public DemoStudentParameterized1(String name, int age)
	   {
		   name = name;
		   age = age;
	   }
	   public void display()
	   {
		   System.out.println("student name is:"+name);
		   System.out.println("student age is :" +age);
	   }
	   public static void main(String[] args)
	   {
		DemoStudentParameterized1 s1 = new DemoStudentParameterized1("ABC", 18);
		s1.display();
		DemoStudentParameterized1 s2 = new DemoStudentParameterized1("XYZ" , 20);
		s2.display();
	}
	}


