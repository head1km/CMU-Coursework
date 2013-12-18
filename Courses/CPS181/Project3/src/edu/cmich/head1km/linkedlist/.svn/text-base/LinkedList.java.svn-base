package edu.cmich.head1km.linkedlist;
 
import java.util.Iterator;
//@author Kyle Head
//CPS 181 project 3
//the linkedlist class will create a linked list and contain all of the different operations that can be done to the list.

public class LinkedList implements IntList{
	
	private Node head;
	private Node tail;
	private int count;
	private int position = 1; 
	
	//constructor for the LinkedList Class. sets the values of head and tail to null and count to 0. 
	public LinkedList()
	{
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	//the insert method will insert a node at the front of the list. the parameter int i is the value to go into the node.
	//@return retval is a boolean that says whether or not an object was able to be inserted at the beginning of a list.
	//@param int i is the value that is to be inserted into a node
	public boolean insert(int i) {
		boolean retval = false;
		Node tempnode = new Node(i);
		if(this.head == null) {
			this.head = tempnode;
			this.tail = tempnode;
		}
		else  {
			tempnode.next = this.head;
			this.head = tempnode;
		}
		count++;
		return retval;
		
	}
	
//the appends method takes a value, int i, and inserts it at the end of the list.
//@return retval is a boolean that says whether or not an object was able to be inserted at the end of a list
//@param int i is the value that is to be inserted into a node
	public boolean appends(int i) {
		boolean retval = false;
		if(this.tail != null){
			Node tempnode = new Node(i);
			tempnode.prev = this.tail;
			this.tail.next = tempnode;
			this.tail = tempnode;
			retval = true;
		}
		return retval;
	}
	
//the integer set method will pick a value out of the index and then assign a new value to that node. 
//then the method returns the integer being replaced.
//@param int index, int j the index points to what node needs to be changed and the value j is the new value of said node.
//@return avalue returns the original value assigned to the node
	public Integer set(int index, int j) {
		Integer avalue = 0;
		Node tempnode = this.head;
		if(index >= 0 && index < size()){
			for(int i = 0; i < index; i++){
				tempnode = tempnode.next;
			}
			avalue = tempnode.num;
			tempnode.num = j;
		}
		return avalue;
		
	}

	public Iterator<Integer> iterator() {
		return  new LLIterator(head);
	}
	
//this insert method will select a certain node and then insert a new node with value i. 
//@param int index, int i index is where the new node will go and i is the value of that node
//@return returns whether the value was sucessfully inserted
	public boolean insert(int index, int i) {
		Node newnode = new Node(i);
		Node tempnode = this.head;
		while(position < (index-1)) {
			tempnode = tempnode.next;
			position++;
		}
		newnode.prev = tempnode;
		newnode.next = tempnode;
		newnode.next.prev = newnode;
		tempnode.next = newnode;
		return true;
	}
	
//the integer get method will return a value from an indexed node. this will happen even if the value is null. 
//@param int index is which node needs to be retrieved 
//@return returns the value that was asked for
	public Integer get(int index) {
		Node tempnode = this.head;
		if(index >= 0 && index < size()){
			
			for(int i = 0; i < index; i++){
				tempnode = tempnode.next;
			}
		}
		return tempnode.num;
	}
	
//the isEmpty method will check and see if the list is empty. 
//@return returns whether the list is empty or not
	public boolean isEmpty() {
		return this.head == null;
		
	}
//the size method will count each node in the list and tell you the size of the list. 
//@return the size of the list
	public int size() {
		int count = 0; 
		Node p = head; 
		while (p != null){
			count++;
			p = p.next; 
		}
		return this.count;
	}
//the remove method will remove a node from the list and forward the previous node to the one after the removed node. 
//@param int index tells the method which index to remove
//@return tells whether the node was sucessfully removed or not. 

	public boolean remove(int index) {
		Node tempnode = this.head;
		if(isEmpty())
			return false; 
		else if((index > 0) && (index <= size())){
			while(position < (index-1)){
				tempnode = tempnode.next; 
				position++; 
			}
			tempnode = tempnode.next;
			if (tempnode.prev == null)	
			tempnode.prev = tempnode;
			else
			tempnode.prev.next = tempnode;
			count--; 
		}
		return true;
		
	}

}
