import java.util.Scanner;

public class ageValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		if(age==0 || age<0) {
			System.out.println("Invalid age");
		}else if(age>18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Minor");
		}
	}

}
