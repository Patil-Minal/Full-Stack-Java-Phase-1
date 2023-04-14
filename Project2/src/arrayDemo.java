import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements"+size);
		for(int i=0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		}
		System.out.println("Given array elements");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
		System.out.println("For Each example");
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
