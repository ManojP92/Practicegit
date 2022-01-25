package com.innerclass;

public class AnnonymousTest {
public static void main(String[] args) {
	Car c=new Car() {
		
		public void stop() {
			System.out.println("Car started from annonymous");
		}
		public void start() {
			System.out.println("Car stopped");
		}
	};
	c.start();
	c.stop();
}
}
