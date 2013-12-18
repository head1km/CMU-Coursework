
/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet;


public class Question implements Questions{

  private String description;

  private int earned;

  private int value;

  private String comment;

//sets a new value for description.
  public void setDescription(String newDescription) {
	  this.description = newDescription;
  }

  //sets a new value for earned.
  public void setEarned(int newEarned) {
	  this.earned = newEarned;
  }

  //sets a new value for value.
  public void setValue(int newValue) {
	  this.value = newValue;
  }

  //sets a new value for comments.
  public void setComment(String newComment) {
	  this.comment = newComment;
  }

  //sets a new value for description.
  public String getDescription() {
  return this.description;
  }

  //gets a new value for earned.
  public int getEarned() {
  return this.earned;
  }

  //gets a new value for value.
  public int getValue() {
  return this.value;
  }

  //gets a new value for comments.
  public String getComment() {
  return this.comment;
  }

  //constructor for question, takes a question name and sets it as a description.
  public Question(String questionName) {
	  this.description = questionName;
	  
	  this.earned = 0;
	  
	  this.value = 0;
	  
	  this.comment = null;
  }

//prints out rubric style questions.
  public void rubricQuestions() {
	System.out.printf("%10s..........%2d / %2d",description,earned, value);
  }

  //prints out gradesheet style questions.
  public void gradesheetQuestions() {
	  System.out.printf("%10s.......... %2d",description, value);
  }
}