package com.shreya;

public class DemoInstance
{
  String name ="Shreya";
  int age = 111;
   public void display()
   { 
	   System.out.println("Name is" +name);
	   System.out.println("Age is" +age);
   }
   public static void main (String [] args)
   
   {
    DemoInstance d = new DemoInstance();
    d.display();
   }
}
