package com.shreya;

public class TigerDEMO
{
	public class tiger extends  DemoAnimal
	
	{
	  String color = "Brown";
	  public void display()
	{
		System.out.println("animal color is :"+ super.color);
		System.out.println("Tiger color is:"+ color);
	}
	public static void main(String[] args)
	{
		 TigerDEMO t = new TigerDEMO`();
		 t.display();
	 }
	}

