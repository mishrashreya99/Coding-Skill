package com.shreya;

public class TigerExtendSuperANIMAL2
{
  String color = "brown";
  public void display()
  {
	  super.eat();
	  System.out.println("tiger color is :"+ color);
  }
  public static void main(String[] args)
  {
	TigerExtendSuperANIMAL2 t = new TigerExtendSuperANIMAL2();
			t.display();
}
}
