import java.util.Scanner;

public class multiArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of row");
		int r = sc.nextInt();
		System.out.println("Enter no of cols");
		int col = sc.nextInt();
		
		int arr[][] = new int [r][col];
		System.out.println("Enter 9 values");
		for(int i = 0; i< arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j] =  sc.nextInt();
			}
		}
		
		for(int i = 0; i< arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		//for each
		
		System.out.println("For each display");
		for(int[] i: arr) {
			for(int j: i) {
				System.out.print(j+"  ");
			}
		}
		
		
		
	}
}
