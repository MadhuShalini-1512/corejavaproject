package com.siiet.InterfaceDemo;

public class Warrior implements Character,Weapon {
	public void use() {
		System.out.println("Welcome");
		
	}
	public void attack() {
		System.out.println("Attack");
		
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.use();
		w.attack();
		
	}

}
