package stringOperations;

import java.util.Scanner;

public class countString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String str = sc.nextLine();
		int vowel =0, consonant=0,word =0;
		
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': 
					vowel++;
					break;
				case ' ': word++;break;
				default: 
					consonant++;
					
			}
		}
		System.out.println("vowels: "+vowel);
		System.out.println("consonant:"+consonant);
		System.out.println("words:"+word);
		
	}

}
