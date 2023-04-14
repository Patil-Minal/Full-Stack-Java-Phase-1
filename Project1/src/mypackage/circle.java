package mypackage;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious: ");
		double r = sc.nextFloat();
		System.out.println("Area of circle: "+pi*r*r);
		
	}

}
