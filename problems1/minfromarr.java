package com.problems1;

import java.util.Scanner;

public class minfromarr {
public static void min(int arr[]) {
	//Scanner sc= new Scanner(System.in);
	int value= arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(value>arr[i])
		{
			value=arr[i];
		}
		
	}
	System.out.println("Minimum value is: "+value);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 numbers: ");
	int arr1[]= new int[5];
    for(int i=0; i<5; i++)
    {
    	arr1[i]=sc.nextInt();
    }
    min(arr1);
}
}
