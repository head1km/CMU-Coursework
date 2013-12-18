package edu.cmich.head1km.queue;
import java.util.ArrayList;

public class Queue <T>implements QueueFace <T> {
	ArrayList <T> arr = new ArrayList <T> ();
	QueueException ex = new QueueException(); 
	@Override
	//front tells the user what object is at the front of the queue.
	//@return x x is whatever object is at the front of the queue.
	public T front() {
		T x;
		if(arr.isEmpty()){
			x = null;
			System.out.println(ex);
			return x;
		}
		else{
		x = arr.get(0);
		return x;
		}
	}

	@Override
	//remove takes the object at the front of the queue and removes it from said queue.
	//@return boolean returns whether the method was able to remove an object.
	public boolean remove() {
		if(arr.isEmpty()){
			System.out.println(ex);
			return false;
		}
		else{
			arr.remove(0);
			return true;
		}
	}

	@Override
	//add add adds an object to the queue.
	//@return boolean reports whether an object was able to be added to the queue.
	public boolean add(T myint) {
		arr.add(myint);
		return true;
	}

	@Override
	//ismt checks the queue to see whether it is empty or not. 
	//@return boolean returns whether the queue is empty or not.
	public boolean ismt() {
		if (arr.isEmpty()) return true;
		return false;
	}
	//size checks what the current size of the queue is.
	//@return size returns the current size of the queue.
	public int size() {
		int size = arr.size();
		return size;
	}
}