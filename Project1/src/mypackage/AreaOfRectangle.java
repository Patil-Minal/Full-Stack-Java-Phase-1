package mypackage;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = s.nextInt();
		System.out.println("Enter Breadth: ");
		int breadth = s.nextInt();
		s.close();        //to avoid memory leak problem
		int area = len * breadth;
		System.out.println("Area of rectange: "+ area);
	}

}
