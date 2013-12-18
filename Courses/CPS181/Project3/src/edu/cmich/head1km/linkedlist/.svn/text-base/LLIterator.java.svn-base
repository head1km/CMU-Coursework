package edu.cmich.head1km.linkedlist;
//@author Kyle Head
//CPS 181 project 3
import java.util.Iterator;

public class LLIterator implements Iterator<Integer> {
	
	private Node cur;
	
	public LLIterator(Node head) {
		this.cur = head;
	}
	
	public boolean hasNext() {
		if( this.cur == null)
			return false;
		else
			return true;
	}
	
	public Integer next() {
		if(this.cur == null)
			return null;
		int tmp = this.cur.num;
		this.cur = this.cur.next;
		return tmp;
	}
	
	public void remove() {
		
	}

}