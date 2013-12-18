import javax.swing.*;

/**
 * @author khead90
 *
 */
public class AVLTree {
	static int getHeight(AVLNode tree) {
		if(tree == null) return -1;
		else return tree.height;
	}
	
	public boolean add(int x) {
		root = add(root, x);
		return true;
	}
	
	public JPanel getView() {
		return new BTreeDisplay(root);
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public AVLNode root = null;
	public AVLNode add(AVLNode bTree, int x) {
		if (bTree == null) return new AVLNode(x);
		if(x < bTree.value) bTree.left = add(bTree.left, x);
		else bTree.right = add(bTree.right, x);
		
		int leftHeight = getHeight(bTree.left);
		int rightHeight = getHeight(bTree.right);
		if (Math.abs(leftHeight - rightHeight) == 2) return balance(bTree);
		else {
			bTree.resetHeight();
			return bTree;
		}
	}
	
	public AVLNode balance(AVLNode bTree) {
		int rHeight = getHeight(bTree.right);
		int lHeight = getHeight(bTree.left);
		
		if(rHeight > lHeight) {
			AVLNode rightChild = bTree.right;
			int rrHeight = getHeight(rightChild.right);
			int rlHeight = getHeight(rightChild.left);
			if (rrHeight > rlHeight) return rrBalance(bTree);
			else return rlBalance(bTree);
		}
		else {
			AVLNode leftChild = bTree.left;
			int llHeight = getHeight(leftChild.left);
			int lrHeight = getHeight(leftChild.right);
			if(llHeight > lrHeight) return llBalance(bTree);
			else return lrBalance(bTree);
		}
	}
	
	public AVLNode rrBalance(AVLNode bTree) {
		AVLNode rightChild = bTree.right;
		AVLNode rightLeftChild = rightChild.left;
		rightChild.left = bTree;
		bTree.right = rightLeftChild;
		bTree.resetHeight();
		rightChild.resetHeight();
		return rightChild;
	}
	
	public AVLNode rlBalance(AVLNode bTree) {
		AVLNode root = bTree;
		AVLNode rNode = root.right;
		AVLNode rlNode = rNode.left;
		AVLNode rlrTree = rlNode.right;
		AVLNode rllTree = rlNode.left;
		
		rNode.left = rlrTree;
		root.right = rllTree;
		rlNode.left = root;
		rlNode.right = rNode;
		
		rNode.resetHeight();
		root.resetHeight();
		rlNode.resetHeight();
		return rlNode;
	}
	
	public AVLNode llBalance(AVLNode bTree) {
		AVLNode leftChild = bTree.left;
		AVLNode lrTree = leftChild.right;
		leftChild.right = bTree;
		bTree.left = lrTree;
		bTree.resetHeight();
		leftChild.resetHeight();
		return leftChild;
	}
	
	public AVLNode lrBalance(AVLNode bTree){
		AVLNode root = bTree;
		AVLNode lNode = root.left;
		AVLNode lrNode = lNode.right;
		AVLNode lrlTree = lrNode.left;
		AVLNode lrrTree = lrNode.right;
		
		lNode.right = lrlTree;
		root.left = lrrTree;
		lrNode.left = lNode;
		lrNode.right = root;
		
		lNode.resetHeight();
		root.resetHeight();
		lrNode.resetHeight();
		return lrNode;
	}
}
