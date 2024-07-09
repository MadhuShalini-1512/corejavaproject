package com.siiet.InterfaceDemo;

public class Demo implements ChildInterface {
	public void print() {
		System.out.println("Print");
	}
	public void show() {
		System.out.println("Show");
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.print();
		d.show();
	}

}
