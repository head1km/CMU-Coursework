/**
 * Roxanne Harris, Alexander Brya, Kyle Head, Ben Lubitz
 * Kyle Head
 * CPS 240
 * Assignment 8
 */
package angsty_Butterflies;

public interface Editor {

    
	  public void Open();

	  public void editMetadata();
	  
	  public void editCourse();
	  
	  public void editQuestions(Question question);

	  public void save();

	  public GradeSheet create();

}