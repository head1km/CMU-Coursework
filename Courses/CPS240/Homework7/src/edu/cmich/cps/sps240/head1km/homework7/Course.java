package edu.cmich.cps.sps240.head1km.homework7;


public class Course {

  private String cName;

  private String term;

  private String crn;


  public void setName(String newName) {
	  this.cName = newName;
  }

  public void setTerm(String newTerm) {
	  this.term = newTerm;
  }

  public void setCrn(String newCrn) {
	  this.crn = newCrn;
  }

  public String getName() {
  return this.cName;
  }

  public String getTerm() {
  return this.term;
  }

  public String getCrn() {
  return this.crn;
  }

}