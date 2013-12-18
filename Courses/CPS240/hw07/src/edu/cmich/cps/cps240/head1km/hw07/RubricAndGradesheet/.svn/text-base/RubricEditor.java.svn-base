/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet;


public class RubricEditor extends Rubric implements Editor {


	Rubric rubric;

	//opens a new instance of rubric.
	public void Open() {
		if(rubric == null) create();
	}
	
	//edits course metadata.
	public void editCourse(){
		String newName;
		String newCrn;
		String newTerm;
		
		course.setCrn(newCrn);
		course.setName(newName);
		course.setTerm(newTerm);
	}
	
	//edits assignment metadata.
	public void editAssignment(){
		String newDescription;
		String newDue;
		String NewIssued;
		String newNumber;
		
		assign.setDescription(newDescription);
		assign.setDue(newDue);
		assign.setIssued(NewIssued);
		assign.setNumber(newNumber);
	}
	
	//edits questions if they exist, if not it will make one.
	public void editQuestions(Question question){
		if(question != null){
		String newComment;
		String newDescription;
		int newEarned;
		int newValue;
		
		question.setComment(newComment);
		question.setDescription(newDescription);
		question.setEarned(newEarned);
		question.setValue(newValue);
		}
		else {
			String quest;
			makeQuestions(quest);
		}
	}

	//method for saving.
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	//creates a new rubric.
	@Override
	public void create() {
		rubric = new Rubric();
	}
}