package com.siiet.Exception;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		finally {
			System.out.println("Hello");
		}
	}
}
