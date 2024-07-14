package com.tnsif.overloading;

public class Child extends Father{
	@Override
	void drinking() {
		System.out.println("horlicks");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.drinking();
	}


}
