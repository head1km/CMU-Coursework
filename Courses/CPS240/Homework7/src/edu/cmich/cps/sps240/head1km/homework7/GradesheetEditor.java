package edu.cmich.cps.sps240.head1km.homework7;


public class GradesheetEditor extends Gradesheet implements Editor {

	Gradesheet gradesheet;
	
	public void editGrades() {
	  
  	}

	public void Open() {
		if(gradesheet == null) create();
	}


	public void editStudent() {
		String newGlobalid;
		String newStudName;
		
		stud.setGlobalid(newGlobalid);
		stud.setName(newStudName);
		
		
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

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create() {
		gradesheet = new Gradesheet();
	}
}