package com.innerclass;

import java.util.Scanner;

public class MulDinArr {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	int array[][]= new int [3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.println("Enter element: ");
			array[i][j]=sc.nextInt();
		}
	}
	System.out.println("Printing ur 2d array: ");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(array[i][j]+"\t");
		}
		System.out.println();
	}
}
}
