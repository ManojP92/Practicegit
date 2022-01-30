package com.problems1;

import java.util.Scanner;

public class Factorialdemo {
public static void fact(int arr[])
{
	
	long mul=1;
	for(int i=0;i<arr.length;i++)
	{   
		long f=1;
		for(int j=1; j<=arr[i];j++)
		{
			f=f*j;
		}
		mul=mul*f;
	}
	System.out.println("Multiplication of all factorials is: "+mul);
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("How many numbers do you want to enter: ");
	int count= sc.nextInt();
	System.out.println("Enter "+count+" numbers: ");
	int arr1[]=new int[count];
	for(int i=0;i<count;i++)
	{
		arr1[i]=sc.nextInt();
	}
	fact(arr1);
}
}
