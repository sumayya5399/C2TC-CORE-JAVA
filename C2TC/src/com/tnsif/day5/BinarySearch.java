package com.tnsif.day5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int size;
		System.out.println("enter the size of the array=");
		
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		
		int[] arr=new int[size];
		System.out.println("enter the elements of the array=");
		
		for(int i=0;i<size;i++)
		{
			  arr[i]=s.nextInt();
		}
        
		System.out.println("Here is  the array=");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		//sort
		Arrays.sort(arr);
		
		System.out.println("enter the key=");
		int key=s.nextInt();
		
		System.out.println(key+ "found at index="+Arrays.binarySearch(arr, key));
	}

}
