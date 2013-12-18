package edu.cmich.head1km.linkedlist;
//@author Kyle Head
//CPS 181 project 3
//the node class will create the individual nodes in the linked list and assign them a value i.
public class Node {
	
	public int num;
	public Node next;
	public Node prev;
	
	//this is the constructor for the Node class. 
	public Node(int i) {
		this.num = i;
		this.next = null;
		this.prev = null;
	}
	

}