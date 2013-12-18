
import java.lang.String;
/**
 * @author Kyle Head
 *
 */
public class BST <T> extends BT implements BSTInterface <T>  {
	public BST() {
		root = null;
		treeException e = new treeException();
	}
	/**
	 * addinorder takes a parameter and passes it to the private addinorder.
	 * @param stuff the data being added to the tree.
	 * @return returns true if this was done.
	 */
	public boolean addinorder(T stuff) {
		root = addinorder(stuff, root);
		return true;
	}
	/**
	 * addinorder adds to the stuff to the tree inorder by recursively comparing stuff to each node in the tree.
	 * @param stuff data to be added to the tree
	 * @param bsttree node the data is being compared to 
	 * @return returns a new node if there is nothing else in the tree or returns where it is added
	 */
	private Node addinorder(T stuff, Node bsttree) {
		
		try {
			if((((String) stuff).charAt(0)< ((CharSequence) bsttree.lefttree).charAt(0))) bsttree.lefttree = addinorder(stuff, bsttree.lefttree);
			else bsttree.righttree = addinorder(stuff, bsttree.righttree);
		} catch (Exception e) {
			System.out.println(e);
		}
		return bsttree;
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
		if(((String) key).charAt(0) == ((CharSequence) bsttree.info).charAt(0)) return true;
		if(((String) key).charAt(0) < ((CharSequence) bsttree.info).charAt(0)) return search(key, bsttree.lefttree);
		else return search(key, bsttree.righttree);
	}
}