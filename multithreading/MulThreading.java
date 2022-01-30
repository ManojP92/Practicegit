package com.multithreading;

public class MulThreading extends Thread {

	public void run() {
		for (int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Started!");
			try {
				Thread.currentThread().sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MulThreading t1= new MulThreading();
		MulThreading t2= new MulThreading();
		MulThreading t3= new MulThreading();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
