package com.shreya;

public class DemoStudentParameterized
{
   String name;
   int age;
   public DemoStudentParameterized(String s1, int n)
   {
	   name = s1;
	   age = n;
   }
   public void display()
   {
	   System.out.println("student name is:"+name);
	   System.out.println("student age is :" +age);
   }
   public static void main(String[] args)
   {
	DemoStudentParameterized s1 = new DemoStudentParameterized("ABC", 18);
	s1.display();
	DemoStudentParameterized s2 = new DemoStudentParameterized("XYZ" , 20);
	s2.display();
}
}
