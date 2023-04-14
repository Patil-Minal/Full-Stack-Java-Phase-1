import java.util.Scanner;

public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []n= new int[5];
		int sum =0;
		System.out.println("Enter array 5 elements");
		for(int i = 0;i<n.length;i++) {
			n[i] = sc.nextInt();
			sum = sum + n[i];
		}
		System.out.println("sum: "+sum);
	}

}
