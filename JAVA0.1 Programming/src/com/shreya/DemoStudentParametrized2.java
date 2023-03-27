package com.shreya;

public class DemoStudentParametrized2 
{

	   String name;
	   int age;
	   public DemoStudentParametrized2(String name, int age)
	   {
		   this.name = name;
		  this. age = age;
	   }
	   public void display()
	   {
		   System.out.println("student name is:"+name);
		   System.out.println("student age is :" +age);
	   }
	   public static void main(String[] args)
	   {
		DemoStudentParametrized2 s1 = new DemoStudentParametrized2("ABC", 18);
		s1.display();
		DemoStudentParametrized2 s2 = new DemoStudentParametrized2("XYZ" , 20);
		s2.display();
	}
	

}
