package com.shreya;

public class DemoArrayIndexException2
{

	   public static void arrayDemo()
	   {
		   int n[] = new int [5];
		   try
		   {
			   n[0] = 10;
			   n[1] = 15;
			   n[2] = 20;
			   n[3] = 25;
			   n[4]  = 30;
			
			   
				   System.out.println(n[3]);
				   System.out.println(n[5]);
			   }
		   catch(ArrayIndexOutOfBoundsException  e)
		   {
			   e.printStackTrace();
		   }
	   }
	   public static void main(String[] args)
	    {
		   DemoArrayIndexException.arrayDemo();
		   System.out.println("program execution completed");
		
	}
	}

