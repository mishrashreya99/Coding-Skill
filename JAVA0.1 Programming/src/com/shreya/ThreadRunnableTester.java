package com.shreya;

public class ThreadRunnableTester
{
public static void main(String[] args)
{
	MyThreadRunnable obj = new MyThreadRunnable();
	Thread t1 = new Thread(obj);
	t1.start();
	for(int i=0 ; i<50; i++)
	{
		System.out.println("job-2");
	}
}
}
