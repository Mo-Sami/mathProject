package ch1;

import java.util.ArrayList;

import sun.management.Sensor;

public class test {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		DynamicArray<stud> Darry = new DynamicArray<stud>();
		for(int i=0; i< 3; i++) {
			stud student = new stud(input.next(), input.nextInt());
			Darry.put(student);
		}
		
//		ArrayList<String> x = new ArrayList<String>();
//		x.add("muhamed");
//		x.add(12);
//		x.add(25.25);
//		x.add(true);
//		Darry.put("muhamed");
	    System.out.println(Darry.getSize());
//		Darry.put(15);
//		System.out.println(Darry.getSize());
//		Darry.put(15);
//		System.out.println(Darry.getSize());
//		Darry.put(15);
//		System.out.println(Darry.getSize());
//		Darry.put(15);
//		System.out.println(Darry.getSize());
	}
}