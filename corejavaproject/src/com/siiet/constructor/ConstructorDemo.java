package com.siiet.constructor;
import java.util.Scanner;
public class ConstructorDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your address");
		String add=sc.next();
		customer c=new customer();
		c.setName(name);
		c.setid(id);
		c.setaddress(add);
		System.out.println(c);
		boolean out = c instanceof customer;
		System.out.println(out);
		
	}

}
