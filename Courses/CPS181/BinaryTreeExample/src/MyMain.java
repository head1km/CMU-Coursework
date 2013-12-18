
/**
 * @author Kyle Head
 * this main method acts as a test for the rest of the classes.
 */
public class MyMain {

	public static void main(String[] args) {
		BT <String> mytree = new BT <String> ();
		mytree.buildmytree();
		mytree.inorder();
		BST <String> mybsttree = new BST <String> ();
		mybsttree.addinorder("5");
		mybsttree.addinorder("7");
		mybsttree.addinorder("2");
		mybsttree.addinorder("11");
		mybsttree.addinorder("666");
		mybsttree.addinorder("4");
		mybsttree.addinorder("3");
		mybsttree.inorder();
		System.out.println("is 3 there??");
		System.out.println(mybsttree.search("3") + " it is.");
	}
}
