package com.tnsif.day5;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr= {15,89,14,13,26,45,19,55,88};
		System.out.println("Entered Array is=");
		
		for(int num:arr)
		{
			 System.out.println(num+" ");
	
		}
          Array.sort(arr);
        System.out.println("Here is your sorted array=");
        
        for(int num:arr)
        {
        	System.out.println(num+" ");
        }
	}
	 System.out.println("length of the array arr is="+arr.length);
      
  }