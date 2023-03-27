package com.shreya;

public class Student1 
{

	   String name;
	   int age;
	   public Student1()
	   {
		   System.out.println("default constructor running");
	   }
	   
	   public Student1(String name, int age)
	   {
		   this();
		   this.name = name;
		   this.age = age;
	   }
	   public void display()
	   {
		   System.out.println("student name is:"+name);
		   System.out.println("student age is :" +age);
	   }
	   public static void main(String[] args)
	   {
		Student1 s1 = new Student1("ABC", 18);
		s1.display();
		Student1 s2 = new Student1("XYZ" , 20);
		s2.display();
	}
	}

