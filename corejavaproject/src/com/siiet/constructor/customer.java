package com.siiet.constructor;

public class customer {
	private String name;
	private String address;
	private int id;
	
	// default constructor
	public customer() {
		System.out.println("Default Constructor");
	}  
	public customer(String name,String address,int id) {
		this.name=name;
		this.address=address;
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
