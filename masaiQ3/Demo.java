package com.masaiQ3;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student roll number");
		
		int roll=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name");
		
		String name=sc.nextLine();
		
		System.out.println("Enter Student address");
		
		String address=sc.nextLine();
		
		while(true) {
			System.out.println("The Student is from Nit or Not! ");
			
			String answer= sc.nextLine();
			
			if(answer.equalsIgnoreCase("Yes")){
				
				Student obj=new Student(roll,name,address);
				System.out.println("Student Roll:"+obj.getRoll());
				System.out.println("Student Name:"+obj.getName());
				System.out.println("Student Address:"+obj.getAddress());
				System.out.println("Collage Name:"+obj.getCollageName());
				break;				
			}
			
			else if(answer.equalsIgnoreCase("No")) {
				
				System.out.println("Enter the collage Name");
				
				String collageName=sc.nextLine();
				
				Student obj=new Student(roll,name,address,collageName);
				System.out.println("Student Roll:"+obj.getRoll());
				System.out.println("Student Name:"+obj.getName());
				System.out.println("Student Address:"+obj.getAddress());
				System.out.println("Collage Name:"+obj.getCollageName());
				break;	
			
				
			}
			else {
				System.out.println("Wrong Input");
			}
		}
		
		
		
		
		
	}

}
