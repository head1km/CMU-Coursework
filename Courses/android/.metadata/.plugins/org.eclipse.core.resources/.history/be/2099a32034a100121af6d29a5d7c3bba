
public class TestSwitchLoop {

	/**
	 * Testing switch -loop - method
	 */
	public static void main(String[] args) {
		//testing for loop and switch statement
		int limit = 25; 
		for (int i=1; i<= limit; i++) {
			int rNum = (int) (Math.random() * 7); 

			String day = nameTheDay(rNum);

			System.out.println( day);

		}//end of for loop

	}//end of main

	/*
	 * A String value returning method : nameTheDay
	 * @param num 
	 */

	public static String nameTheDay(int num) {

		String name = "";

		switch(num) {
		case 0: name = "Sunday"; break;
		case 1: name = "Monday"; break;
		case 2: name = "Tuesday"; break;
		case 3: name = "Wednesday"; break;
		case 4: name = "Thursday"; break;
		case 5: name = "Friday"; break;
		case 6: name = "Saturday"; break;
		default: name ="Illegalday"; break;
		} //end of switch

		return name; 

	}//end of nameTheDay method

}//end of class
