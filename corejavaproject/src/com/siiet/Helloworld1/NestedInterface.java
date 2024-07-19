package com.siiet.Helloworld1;

public class NestedInterface implements Innerinterface.Interface1 {
	public void print() {
		System.out.println("Inner Interface");
	}
	public static void main(String[] args) {
		NestedInterface n=new NestedInterface();
		n.print();
		System.out.println(NestedInterface.a);
	}

}
