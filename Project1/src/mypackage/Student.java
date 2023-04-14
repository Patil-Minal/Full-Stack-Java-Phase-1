package mypackage;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Roll no: ");
		int roll = sc.nextInt();
		System.out.println("Marks in maths: ");
		float m = sc.nextFloat();
		System.out.println("Marks in english: ");
		float e = sc.nextFloat();
		System.out.println("Marks in science: ");
		float s = sc.nextFloat();
		float total = m+e+s;
		float avg = m+e+s/2;
		System.out.println("Total is:  "+total);
		System.out.println("Average: "+avg);
	}
}
