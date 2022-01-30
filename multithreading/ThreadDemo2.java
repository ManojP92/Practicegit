package com.multithreading;

public class ThreadDemo2 implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName()+" Is running!");
		
	}
	public static void main(String[] args) {
		ThreadDemo t1= new ThreadDemo();
		t1.start();
		ThreadDemo t2=new ThreadDemo();
		t2.start();
	}
}
