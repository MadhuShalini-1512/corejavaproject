package com.siiet.Abstraction;

public class Square extends Shape {
	private float side;
	public Square() {
		side=3.4f;
	}
	public Square(float side) {
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
	}
}
