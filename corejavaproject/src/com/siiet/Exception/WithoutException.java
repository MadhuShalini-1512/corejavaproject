package com.siiet.Exception;

public class WithoutException {
	public static void main(String[] args) {
		int a=5;
		try {
			int b=6/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is caught"+e.getMessage());
		}
	}
}
