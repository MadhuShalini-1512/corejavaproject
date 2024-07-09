package com.siiet.Abstraction;

public abstract class Demo {
	public static void main(String[] args) {
		Shape s=new Square(1.9f);
		s.calarea();
		s.show();
	}

}
