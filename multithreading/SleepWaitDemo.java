package com.multithreading;

public class SleepWaitDemo {

	public static Object LOCK=new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Thread "+Thread.currentThread().getName()+" Is woken up after sleeping of 1 sec");
		synchronized (LOCK) {
			LOCK.wait(1000);
			System.out.println("Object "+LOCK+" is woken up after waiting of 1 sec");
			
		}
	}
}
