package com.shreya;

import java.util.Scanner;

public class CustomExceptionValidateAge
{
  public void CustomExceptionvalidateAge(int age)
  {
	  if(age<18)
	  {
		  throw new ArithmeticException("your age is below 18 you are not allowed for voting");
		  
	  }
	  else
	  {
		  System.out.println("welcome you are eligible for voting");
	  }
  }
  public static void main(String[] args) 
  {
	Scanner s = new Scanner (System.in);
     System.out.println("enter your age");
     int age = s.nextInt();
      CustomExceptionValidateAge obj =new  CustomExceptionValidateAge();
      obj.CustomExceptionvalidateAge(age);
}
}
