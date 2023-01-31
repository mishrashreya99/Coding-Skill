package com.shreya;

public class DemoPrivate
{
	private int age =21;
	private String name= "xyz";
	private void display()
	{
		System.out.println("Age is "+age);
	}
	public static void main(String[] args)
	{
		DemoPrivate d= new DemoPrivate();
		d.display();
		System.out.println("Name is "+ d.name);
	}
}

