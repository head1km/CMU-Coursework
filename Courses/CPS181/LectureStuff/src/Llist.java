
public class Llist {
	Node head; 
	Node tail;
	int count = 0;
	
	//constructors
	
	public Llist() {
		head = null;
		tail = null; 
		count = 0;
		if(head == null)
			System.out.println("null");
	}
	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public void addnode() {
		Node newnode = new Node("Tom", 21); 
		//tostring to display the stuff. 
		
	}
	
}

