package com.masaiQ4;

public class Car {
	String model;
	String CompanyName;
	String Color;
	
	
	Engine e1=new Engine();

	public Car(String model, String companyName, String color) {
		super();
		this.model = model;
		CompanyName = companyName;
		Color = color;
		
		
	}

	/**
	 * 
	 */
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Car c1= new Car();
		c1.model="Harrier";
		c1.CompanyName="Tata";
		c1.Color="Red";
		c1.e1.hasTurbo=false;
		c1.e1.rpm=100;
		c1.e1.Power=200;
		c1.e1.manufacturer="Landrover";
		
		System.out.println("Car Model:"+c1.model);
		System.out.println("Car Company:"+c1.CompanyName);
		System.out.println("Car Color:"+c1.Color);
		System.out.println("Car Engine turbo :"+c1.e1.hasTurbo);
		System.out.println("Car Engine rpm:"+c1.e1.rpm);
		System.out.println("Car Engine Power:"+c1.e1.Power);
		System.out.println("Car Engine manufacturer:"+c1.e1.manufacturer);
		
		
		
		
		
	}

}
