package com.siiet.Multithreading;

public class TSynch {
public static void main(String[] args) {		
		T t1=new T();
		T t2=new T();
		T t3=new T();
		t1.start();
		t2.start();
		t3.start();
	}
}
