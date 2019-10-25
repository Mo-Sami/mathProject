package ch1;

import java.util.Scanner;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter value");
		LinkList ls = new LinkList();
		
		// acsess link list 
		
		for(int i =0; i<5; i++) {
		ls.add(new Node(input.nextInt(), null));
		}
		
		//printed link list
		System.out.println("\nprint data\n");
			ls.display();
		}
}
