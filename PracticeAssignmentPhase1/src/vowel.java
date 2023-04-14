import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character: ");
		char ch = sc.next().charAt(0);
		
		if(ch=='a'  || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("consonant");
		}
	}

}
