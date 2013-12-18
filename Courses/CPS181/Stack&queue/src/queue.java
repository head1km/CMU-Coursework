
public interface queue {
	char remove();
	
	void add2rear(char i);
	
	char front() throws StackUnderflowException;
	
	boolean ismtq();
	
	void printq();
}
