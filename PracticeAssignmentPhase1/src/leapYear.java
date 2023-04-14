import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
		String result = year%4==0 && year%100!=0 ? "Leap Year":"Not a leap year";
		System.out.println(result);
	}

}
