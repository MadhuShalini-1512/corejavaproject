package com.siiet.Helloworld1;

import java.util.Scanner;

public class ZeroorNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter a Number");
		int number = sc.nextInt();
		if(number == 0 ) {
			System.out.println("The number is Zero");
		}
		else {
			System.out.println("The number is not Zero");
		}
		sc.close();
	}
}

