package com.masaiQ2;

public class Demo {
	Demo(){
		this(10);
		System.out.println("inside Demo()....");
	}
	Demo(String s){
		this(5.75f);
		System.out.println("inside Demo(String )....");
		System.out.println(s);
	}
	Demo(int i){
		this("hello");
		System.out.println("inside Demo(int )....");
		System.out.println(i);
	}
	Demo(float f){
		
		System.out.println("inside Demo(float )....");
		System.out.println(f);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1= new Demo();
		

	}

}
