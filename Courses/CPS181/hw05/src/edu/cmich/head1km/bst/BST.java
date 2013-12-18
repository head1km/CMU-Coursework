package edu.cmich.head1km.bst;
import java.lang.String;
/**
 * @author Kyle Head
 *
 */
public class BST <T> extends BT implements BSTInterface <T>  {
	treeException ex = new treeException();
	Node root;
	public BST() {
		root = null;
		
	}
	/**
	 * addinorder takes a parameter and passes it to the private addinorder.
	 * @param stuff the data being added to the tree.
	 * @return returns true if this was done.
	 */
	public boolean addinorder(T stuff) {
		if(root == null) {
			root = new Node(stuff,null,null);
		}
		else addinorder(stuff, root);
		return true;
	}
	/**
	 * addinorder adds to the stuff to the tree in order by recursively comparing stuff to each node in the tree.
	 * @param stuff data to be added to the tree
	 * @param bsttree node the data is being compared to 
	 * @return returns a new node if there is nothing else in the tree or returns where it is added
	 */
	
	private  boolean addinorder(T stuff, Node bsttree){
		if (bsttree == null) return false;
		try {
			 if (((String) stuff).charAt(0) < ((CharSequence) bsttree.info).charAt(0)) {
			    if (bsttree.lefttree == null) {
			        bsttree.lefttree = new Node(stuff, null, null);
			        return true;
			    }
			    else return addinorder(stuff, bsttree.lefttree);   
			}
			else {
			    if (bsttree.righttree == null) {
			        bsttree.righttree = new Node(stuff, null, null);
			        return true;
			    }   
			    else return addinorder(stuff, bsttree.righttree); 
			}
	    }
	    catch (Exception e) {
			System.out.println(ex);
			return false;
		}
	}

	/**
	 * search calls the private search method
	 * @param key what is being searched for
	 */
	public boolean search(T key) {
		return search(key, root);
	}
	
	/**
	 * search looks in the tree by recursive comparison to find the key and then returns it
	 * @param key data being searched for
	 * @param bsttree position in the tree
	 * @return the object that was searched for
	 */
	
	private boolean search(T key, Node bsttree) {
		if(bsttree == null) return false;
		try {
			if (bsttree.info == key) return true;
			else if (((String) key).charAt(0) < ((CharSequence) bsttree.info).charAt(0)) {
				if (bsttree.lefttree.info == key) return true;
				else return search(key, bsttree.lefttree);
			}
			else {
				if (bsttree.righttree.info == key) return true;   
				else return search(key, bsttree.righttree);
			}
		} catch (Exception e) {
			System.out.println(ex);
			return false;
		}
	}
}