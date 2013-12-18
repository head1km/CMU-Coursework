/*
 * DataModel
 * 
 * Author albee
 * Kyle Head
 * $Id$
 * 
 * Oct 3, 2011
 * 
 */
package cps240;

/**	The class DataModel performs the basic setting and getting operations for
 * 	the program concerning the score values. The three values score1, score2,
 * 	and score3 are all private values in the DataModel class. Since these 
 * 	fields are private the class contains their various setters and getters. 
 * 	There are also two different kinds of constructors for the class, one with
 * 	no parameters and one with a value for each of the score fields. There is 
 * 	also a method which adds up all of the scores and returns a total value. 
 */
public class DataModel {
	private double score1;
	private double score2;
	private double score3;
	
/**	The DataModel method acts as a constructor for the DataModel class.
 * 	When called it will set score1, score2, and score3 to 0.0. 
 */
	public DataModel(){
		this(0.0, 0.0, 0.0);
	}
	
/**	This is another constructor for the DataModel class. This class takes
 * 	in three parameters and then sets each one as their respective score value.
 * 
 * 	@param score1	the double valued to be displayed. When the value is null
 * 					the text box will be blank for this value. 
 * 	@param score2	the double valued to be displayed. When the value is null
 * 					the text box will be blank for this value. 
 * 	@param score3	the double valued to be displayed. When the value is null
 * 					the text box will be blank for this value. 
 */
	public DataModel(double score1, double score2, double score3) {
		super();
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

/**	This is a getter for the private value score1. When called it will
 * 	return a value.
 * 
 * 	@return	score1	The value of the first score is entered into this variable.
 */
	public double getScore1() {
		return score1;
	}

/**	This is the setter method for the variable score1. When called the method
 * 	will take the passed parameter and assign this.score1 it's value.
 * 
 * 	@param score1	This is the numeric value for the first score. 
 */
	public void setScore1(double score1) {
		this.score1 = score1;
	}

/**	This is a getter for the private value score2. When called it will
* 	return a value.
* 
* 	@return	score2	The value of the first score is entered into this variable.
*/
	public double getScore2() {
		return score2;
	}

/**	This is the setter method for the variable score1. When called the method
* 	will take the passed parameter and assign this.score1 it's value.
* 
* 	@param score1	This is the numeric value for the first score. 
*/
	public void setScore2(double score2) {
		this.score2 = score2;
	}

/**	This is a getter for the private value score3. When called it will
* 	return a value.
* 
* 	@return	score3	The value of the first score is entered into this variable.
*/
	public double getScore3() {
		return score3;
	}

/**	This is the setter method for the variable score1. When called the method
* 	will take the passed parameter and assign this.score1 it's value.
* 
* 	@param score1	This is the numeric value for the first score. 
*/
	public void setScore3(double score3) {
		this.score3 = score3;
	}
	
/**	The method total returns the total of the three scores added together. 
 * 
 * 	@return score1+score2+score3	Returns the combined value of the three
 * 									score values. 
 */
	public double total(){
		return score1 + score2 + score3;
	}
	
}
