package com.shreya;

public class MyThreadRunnable implements Runnable
{ 
	public void run()
	{
		for(int i=0; i<50; i++)
		{
			System.out.println("job-1");
		}
	}

}
