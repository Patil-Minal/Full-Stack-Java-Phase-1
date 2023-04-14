import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Options: \n1.Add Element at last\n2.Add element at first\n"
				+ "3.Add element at given index\n4.Update element at given index"
				+ "\n5.Delete first element\n6.Delete last element\n7.Delete given element"
				+ "\n8.Delete element at given index\n9.Display elements\n10.Exit");
		
		LinkedList ll = new LinkedList();
		int ch=0;
		
		do {
		System.out.println("Select one option");
		ch =  sc.nextInt();
		int ele,ind;
		
		switch(ch) {
			case 1:
				System.out.println("Enter Element:");
				ele = sc.nextInt();
				ll.addLast(ele);
				System.out.println(ll);
				break;
			case 2:
				System.out.println("Enter Element:");
				ele = sc.nextInt();
				ll.addFirst(ele);
				System.out.println(ll);
				break;
			case 3:
				System.out.println("Enter Element:");
				ele = sc.nextInt();
				System.out.println("Enter Index");
				ind = sc.nextInt();
				ll.add(ind, ele);
				System.out.println(ll);
				break;
			case 4:
				System.out.println("Enter Element:");
				ele = sc.nextInt();
				System.out.println("Enter Index");
				ind = sc.nextInt();
				ll.set(ind, ele);
				System.out.println(ll);
				break;
			case 5:
				ll.removeFirst();
				System.out.println(ll);
				break;
			case 6:
				ll.removeLast();
				System.out.println(ll);
				break;
			case 7:
				System.out.println("Enter Element:"); //does not work
				ele = sc.nextInt();
				//ll.remove();
				System.out.println(ll);
				break;
			case 8:
				System.out.println("Enter Index");
				ind = sc.nextInt();
				ll.remove(ind);
				System.out.println(ll);
				break;
			case 9:
				System.out.println("LIST: "+ll);
				break;
			case 10:
				System.out.println("Exiting Program");
				break;
			default: 
				System.out.println("Invalid choice");
				break;
		}
		}while(ch!=10);
		
		
	}

}
