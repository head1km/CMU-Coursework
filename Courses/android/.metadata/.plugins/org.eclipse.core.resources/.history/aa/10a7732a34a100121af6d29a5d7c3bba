
public class TestIfElseIfLoop {

	/**
	 * Testing if-else if --loop --method
	 */
	public static void main(String[] args) {
		//testing for loop and if-else if statements
		int limit = 25;
		for (int i=1; i<= limit; i++) {
			int score = (int) (Math.random() * 100); 

			char grade = computeGrade(score);

			System.out.println( "Score = \t" + score + "\t Grade = \t" + grade);

		}//end of for loop



	}//end of main

	/*
	 * A char value returning method: computeGrade
	 * @param num
	 */

	public static char computeGrade(int num) {

		char grade = '*';
		if (num >100) grade='#';
		else if (num >90) grade ='A';
		else if (num >80) grade ='B';
		else if (num >70) grade ='C';
		else if (num >60) grade = 'D';
		else grade ='E';
		return grade; 

	}//end of computeGrade method


}//end of class