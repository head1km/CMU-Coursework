/*
 * Roxanne Harris Alex Brya, Ben lubitz, Kyle Head
 * Kyle Head
 * CPS 240
 * Assignment 8
 * 11/7/11
 */
package angsty_Butterflies;

public class RubricMetadata {

  private Course course;

  private String issued;

  private String description;

  private String due;

//  private String assignment;

  
  //finds the course data
  public Course getCourse() {
	  return course;
  }
  
  	//Sets the course data to the metadata
  public void setCourse(Course currcourse) {
	  course = currcourse;
  }
  	// finds the date project was issued
  public String getIssued() {
	  return issued;
  }
  	//sets the date the project was issued to metadata
  public void setIsuued(String dateIssued) {
	  issued = dateIssued;
  }
  	//Finds projects Description
  public String getDescription() {
	  return description;
  }
  	//sets projects description to metadata
  public void setDescription(String aDescription) {
	  description = aDescription;
  }
  	// gets the due data
  public String getDue() {
	  return due;
  }
  	//sets the due data to the metadata
  public void setDue(String dateDue) {
	  due = dateDue;
	  
  }

}