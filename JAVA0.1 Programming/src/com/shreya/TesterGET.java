package com.shreya;

public class TesterGET 
{
 public static void main(String[] args) 
 {
	 MyThreadGET t1 = new MyThreadGET();
	 t1.start();
	 try
		 {
			 System.out.println("Thread name is:"+ t1.getName());
			 t1.setName("XYZ");
			 System.out.println("updated thread name is:" + t1.getName());
		 }
	 catch(Exception   e)
	 {
		 e.printStackTrace();
	
			 
		 }
	 }
	
}
