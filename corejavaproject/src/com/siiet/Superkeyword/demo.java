package com.siiet.Superkeyword;

public class demo extends Superexample {
	int a=7;
	void drinking() {
		System.out.println("tea");
	}
	void display() {
//		System.out.println(a);
//		System.out.println(super.a);
		drinking();
		super.drinking();	
	}
	demo(){
		super();
	}
	public static void main(String[] args) {
		demo d=new demo();
		
		d.display();
	}
}
