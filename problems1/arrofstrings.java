package com.problems1;

import java.util.Scanner;

public class arrofstrings {
public static void search(String a)
{
	boolean yureka=false;
	String arr[]= {"manya@hotmail.com", "sensei@master.com","values@mmail.com",
			     "moonlight@space.com","qwerty@keyboard.com", "abcd@alphabet.com"};
	for(int i=0;i<6;i++)
	{
		if(a.contains(arr[i]))
			yureka=true;
		break;
	}
	if(yureka)
	
		System.out.println("Welcome user");
	else System.out.println("You are not registered user");
	
}
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your E-mail: ");
	String s=sc.next();
	search(s);
}
}
