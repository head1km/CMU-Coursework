
public class MyRecProj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int thewidth = 0;
		Rectangle rec1 = new Rectangle();
		System.out.println(rec1.toString());
		//thewidth = rec1.getWidth();
		//System.out.println(thewidth);
		Rectangle rec3 = new Rectangle(3, 5);
		System.out.println(rec3.toString());
		thewidth = rec3.getWidth();
		//System.out.println("the width of rec3 is " + thewidth);
	}

}
