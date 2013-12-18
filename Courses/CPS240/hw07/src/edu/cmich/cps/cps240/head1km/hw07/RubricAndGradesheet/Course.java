package edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet;


public class Course {

  private String cName;

  private String term;

  private String crn;

//sets values for course name.
  public void setName(String newName) {
	  this.cName = newName;
  }
  
//sets term value.
  public void setTerm(String newTerm) {
	  this.term = newTerm;
  }

  //sets a new CRN value.
  public void setCrn(String newCrn) {
	  this.crn = newCrn;
  }

  //gets the course name.
  public String getName() {
  return this.cName;
  }

  //gets a term.
  public String getTerm() {
  return this.term;
  }

  //gest a new a crn
  public String getCrn() {
  return this.crn;
  }

}