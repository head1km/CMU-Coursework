/**
 * 
 */

/**
 * @author khead90
 *
 */
public class AVLNode {
	int value;
	AVLNode left, right;
	int height;
	
	public AVLNode(int value) {
		this(value, null, null);
	}
	public AVLNode(int val, AVLNode left1, AVLNode right1) {
		value = val;
		left = left1;
		right = right1;
		height = 0;
	}
	void resetHeight() {
		int leftHeight = AVLTree.getHeight(left);
		int rightHeight = AVLTree.getHeight(right);
		height = 1 + Math.max(leftHeight, rightHeight);
	}
}
