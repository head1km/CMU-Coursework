
public class Rectangle {
	int length;
	int width;
	int area;


public Rectangle() { 
		length = 0;
		width = 0;
		area = arearec();
	}
public Rectangle(int l, int w) {
	length = l;
	width = w; 
	area = arearec();
}
	
public int getWidth() {
		int wid;
		wid = width;
		return wid;
	}

private int arearec(){
	int thearea;
	thearea = length * width;
	return thearea;
}

public String toString() {
	String str;
	str = "The width is " + width + " the area is " + arearec();
	return str;
}

}