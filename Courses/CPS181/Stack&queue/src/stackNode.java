
public class stackNode {
	private char info;
	public stackNode next;
	
	public stackNode(char info) {
		this.info = info;
		next = null; 
	}

	public char getInfo() {
		return info;
	}

	public void setInfo(char info) {
		this.info = info;
	}
	
}
