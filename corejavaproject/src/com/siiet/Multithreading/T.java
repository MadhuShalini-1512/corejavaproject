package com.siiet.Multithreading;

public class T extends Thread{
	Example e;
	public void run() {
		Example.display();
	}
}
