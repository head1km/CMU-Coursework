package edu.cmich.head1km.linkedlist;
//@author Kyle Head
//CPS 181 project 3
import java.util.Iterator;

public class TestLL {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.insert(1);
		ll.appends(2);
		ll.insert(3);
		ll.appends(4);

		for(Iterator<Integer> lliter = ll.iterator();lliter.hasNext();){
			System.out.println(lliter.next());
		}
		System.out.println("___");
		LinkedList ll2 = new LinkedList();

		ll2.appends(1);
		ll2.appends(2);
		ll2.appends(3);
		ll2.appends(4);
		ll2.remove(2);

		for(Iterator<Integer> lliter = ll2.iterator();lliter.hasNext();){
			System.out.println(lliter.next());
		}

		ll2.set(3,0);
//		ll2.set(2,7);
		System.out.println("___");
		for(Iterator<Integer> lliter = ll2.iterator();lliter.hasNext();){
			System.out.println(lliter.next());
			System.out.println("---");
		}
	}

}