package com.shreya;

public class BinarySearch 
{
	public void BinarySearch(int first ,int last, int[]arr,int key)
  {
	  int mid = (first+last)/2;
	  while(first<=last)
	  {
		  if (arr[mid]<key)
		  {
			  first=mid+1;
		  }
		  else if(arr[mid]==key)
		  {
			 System.out.println("numbers is found");
			   }
		  else
		  {
			  last= mid-1;
			  
		  }
		  mid=(first+last)/2;
	  }
	  if(first>last)
	  {
		  System.out.println("number is not found");
	  }
  }
}
