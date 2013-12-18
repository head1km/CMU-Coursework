package edu.cmich.head1km.bst;

/**
 * @author khead90
 *
 * @param <T>
 */
public class BT <T> implements BTInterface <T> {
	Node root;
	/**
	 * a standard constructor where no data is put into the tree. the tree is just created to null.
	 */
	BT() {
		root = null;
	}
	/**
	 * constructor for the BT class with data as a param.
	 * @param data the data to be stored within the node
	 */
	BT(T data){
		Node t = new Node(data);
		root = t;
	}
	/**
	 *  buildmytree constructs a binary tree starting with 4 nodes and assigns a root node.
	 */
	public Node buildmytree() {
		Node dnode = new Node(4);
		Node cnode = new Node(3, dnode, null);
		Node bnode = new Node(2); 
		Node anode = new Node(1, bnode, cnode);
		root = anode;
		return root;
	}
	 
	/**
	 * ismt checks if the binary tree is empty. 
	 */
	public boolean ismt() {
		if(root == null)  return true;
		return false;
	}
	/**
	 *  the public inorder is what is called throughout the program to access the private inorder which does the work. 
	 */
	public void inorder(){
		inorder(root);
	}
	
	/**
	 * @param theroot cals the root node to be used in the method
	 * this method prints out the nodes of the binary tree inorder recursively. 
	 */
	private void inorder(Node theroot){
		if(theroot != null){
			inorder(theroot.lefttree);
			System.out.println(theroot.info);
			inorder(theroot.righttree);
		}
	}
}