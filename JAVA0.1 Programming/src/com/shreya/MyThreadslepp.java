package com.shreya;

public class MyThreadslepp implements Runnable
{
 public void run()
 {
	 try
	 {
		 for(int i =0; i<50; i++)
		 {
			 System.out.println("job-1");
			 Thread.sleep(1000);
		 }
	 }
	 catch(InterruptedException e)
	 {
		 e.printStackTrace();
		 
	 }
 }
}
