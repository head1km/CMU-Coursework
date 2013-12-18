package edu.cmich.cps.sps240.head1km.homework7;


public class Assignment {

  private String number;

  private String issued;

  private String due;

  private String description;

 
  public void setNumber(String newNumber) {
	  number = newNumber;
  }

  public void setIssued(String NewIssued) {
	  issued = NewIssued;
  }

  public void setDue(String newDue) {
	  due = newDue;
  }

  public void setDescription(String newDescription) {
	  description = newDescription;
  }

  public String getNumber() {
  return this.number;
  }

  public String getIssued() {
  return this.issued;
  }

  public String getDue() {
  return this.due;
  }

  public String getDescription() {
  return this.description;
  }

}
