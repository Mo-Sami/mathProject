package ch1;

public class LinkList {
	Node head;
	public LinkList(Node head) {
		this.head = head;
	}
	public LinkList() {
		
	}
	public void add(Node newNode) { // add in first space 
		newNode.next = head;
		head = newNode;	
	}
	public void delete() { // delete first element
		head = head.next;
	}
	public void display() {
		Node n = head;
		while( n != null ) {
			System.out.println(n.value);
			 n = n.next;
		}
	}
}
