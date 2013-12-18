package edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet;


public class Assignment {

  private String number;

  private String issued;

  private String due;

  private String description;

 //sets a new assignment number.
  public void setNumber(String newNumber) {
	  number = newNumber;
  }

  //sets a new issued date.
  public void setIssued(String NewIssued) {
	  issued = NewIssued;
  }

  //sets a new due date.
  public void setDue(String newDue) {
	  due = newDue;
  }

  //sets a new assignment description.
  public void setDescription(String newDescription) {
	  description = newDescription;
  }

  //returns assignment number.
  public String getNumber() {
  return this.number;
  }

  //returns issued date.
  public String getIssued() {
  return this.issued;
  }

  //returns due date.
  public String getDue() {
  return this.due;
  }

  //returns assignment description.
  public String getDescription() {
  return this.description;
  }

}
