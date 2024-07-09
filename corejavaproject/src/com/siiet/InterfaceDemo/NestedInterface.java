package com.siiet.InterfaceDemo;

public class NestedInterface implements MyInterface.MyInnerInterface {
	public void print() {
		System.out.println("Inner Interface");
	}
	public static void main(String[] args) {
		NestedInterface n=new NestedInterface();
		n.print();
		System.out.println(NestedInterface.id);
	}

}
