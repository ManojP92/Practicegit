package com.innerclass;

import java.util.Scanner;

public class Stringmethods {
public static void main(String[] args) {
	String s="Hello World";
	System.out.println("Length: "+s.length());
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ur password: ");
	String pw= sc.nextLine();
	
	if(s.equalsIgnoreCase(pw))

		System.out.println("Authenticated");
	else
		System.out.println("Incorrect");
}
}
