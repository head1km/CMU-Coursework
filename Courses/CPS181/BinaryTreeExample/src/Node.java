
/**
 * @author Kyle Head
 * creates nodes for the binary tree
 */
public class Node <T> {
	public T info;
	public Node lefttree;
	public Node righttree;
	
	public Node (T myinfo){
		info = myinfo;
		lefttree = null;
		lefttree = null;
	}
	
	public Node (T myinfo, Node lt, Node rt){
		info = myinfo;
		lefttree = lt;
		righttree = rt;
	}
}
