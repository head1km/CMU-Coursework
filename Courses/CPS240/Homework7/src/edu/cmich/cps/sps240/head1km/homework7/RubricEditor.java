/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.sps240.head1km.homework7;


public class RubricEditor extends Rubric implements Editor {


	Rubric rubric;
	
	public void editGrades() {
	  
  	}

	public void Open() {
		if(rubric == null) create();
	}
	
	public void editCourse(){
		String newName;
		String newCrn;
		String newTerm;
		
		course.setCrn(newCrn);
		course.setName(newName);
		course.setTerm(newTerm);
	}
	
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

	
	static void makeQuestions(String questionName) {
		questions[questionsMade] = questionFactory.getQuestion(questionName);
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create() {
		rubric = new Rubric();
	}
}