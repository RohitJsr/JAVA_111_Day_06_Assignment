package com.masaiQ1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setAge(19);
		s1.setMarks(333);
		s1.setRoll(12);
		s1.setName("Rohan");
		s1.showDetails();
		System.out.print("+++++++++++++++++++++++++++++++++++"+"\n");
		Student s2=new Student(18,"Mohan",33,360);
		s2.showDetails();

	}

}
