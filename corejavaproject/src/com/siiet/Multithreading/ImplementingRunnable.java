package com.siiet.Multithreading;

public class ImplementingRunnable implements Runnable{
	
	public static void main(String[] args) {
		ImplementingRunnable r=new ImplementingRunnable();
		Thread t1=new Thread(r);
		t1.start();
	}
	public void run() {
		System.out.println("implementing runnable interface");
		}
}
