
/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.sps240.head1km.homework7;


public class Question implements Questions{

  private String description;

  private int earned;

  private int value;

  private String comment;


  public void setDescription(String newDescription) {
	  this.description = newDescription;
  }

  public void setEarned(int newEarned) {
	  this.earned = newEarned;
  }

  public void setValue(int newValue) {
	  this.value = newValue;
  }

  public void setComment(String newComment) {
	  this.comment = newComment;
  }

  public String getDescription() {
  return this.description;
  }

  public int getEarned() {
  return this.earned;
  }

  public int getValue() {
  return this.value;
  }

  public String getComment() {
  return this.comment;
  }

  public Question(String questionName) {
	  this.description = questionName;
	  
	  this.earned = 0;
	  
	  this.value = 0;
	  
	  this.comment = null;
  }


  public void rubricQuestions() {
	System.out.printf("%10s..........%2d / %2d",description,earned, value);
  }

  public void gradesheetQuestions() {
	  System.out.printf("%10s.......... %2d",description, value);
  }
}