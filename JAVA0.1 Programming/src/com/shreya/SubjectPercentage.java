package com.shreya;
import java.util.*;

public class SubjectPercentage
{
	public static void main(String[] args)
	{
		int math, eng, sci, hindi,arts;
		float total , Per;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter math subject number");
		 math = s.nextInt();
		 System.out.println("Enter english subject number");
		 eng = s.nextInt();
		 System.out.println("Enter science subject number");
		 sci= s.nextInt();
		 System.out.println("Enter hindi subject number");
		 hindi = s.nextInt();
		 System.out.println("Enter arts subject number");
		 arts = s.nextInt();
		 total = math+ eng+ sci+hindi+arts;
		 Per =(total/500)*100;
		 System.out.println("over all percentage is" +Per+"% ");
		
	}
}
