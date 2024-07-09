package com.siiet.overriding;

public class Demo {
	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s.getRateofInterest());
		RBI r=new RBI();
		System.out.println(r.getRateofInterest());
	}

}
