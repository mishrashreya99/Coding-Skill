package com.shreya;

public class MyThread  extends Thread
{
   public void run()
   {
	   for(int i =0; i<50; i++) 
	   {
		   System.out.println("job-1");
	   }
   }
}
