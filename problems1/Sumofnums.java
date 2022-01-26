package com.problems1;

import java.util.Scanner;

public class Sumofnums {
public static void sum(int arr[])
{
	int total=0;
	for(int i=0;i<10;i++)
	{
		total=total+arr[i];
	}
	System.out.println("Sum of 10 numbers is: "+total);
}

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 numbers:");
	int a[]= new int[10];
	for(int i=0;i<10;i++)
	a[i]=sc.nextInt();
	sum(a);
}
}
