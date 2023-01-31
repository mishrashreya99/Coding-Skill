package com.shreya;

 public class Demofinal5
 {
	 final int AGE = 25;
	 int p =18;
	 public void display()
   {
	 System.out.println("age = " + AGE);
	 System.out.println(p);
	 // AGE= 22;
	 System.out.println("age is = " + AGE);
     }
   public static void main (String[]args)
   {
	   Demofinal5 d5 = new Demofinal5();
	   d5.display();
	   System.out.println("age = " + d5.AGE );
	   /* 
	    * AGE = AGE+1;
	    * System("age = " + d5.AGE);
	    */
   }
 }
