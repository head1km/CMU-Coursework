package edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet;

public interface Editor {
    
	  public void Open();

	  public void editAssignment();
	  
	  public void editCourse();
	  
	  public void editQuestions(Question question);

	  public void save();

	  public void create();

	}