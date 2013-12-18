package edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet;

//half finished class because gui would send data to be edited. 
public class GradesheetEditor extends Gradesheet implements Editor {

	Gradesheet gradesheet;

	//opens an instance of gradesheet.
	public void Open() {
		if(gradesheet == null) create();
	}

	//edits the student metadata.
	public void editStudent() {
		String newGlobalid;
		String newStudName;
		
		stud.setGlobalid(newGlobalid);
		stud.setName(newStudName);
	}
	
	//edits the course metadata.
	public void editCourse(){
		String newName;
		String newCrn;
		String newTerm;
		
		course.setCrn(newCrn);
		course.setName(newName);
		course.setTerm(newTerm);
	}
	
	//edits the assignment metadata.
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
	
	//edits question metadata if there are questions, if not it makes them.
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

	//stub for save function, I'm not sure how to implement it.
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	//creates a new gradesheet.
	@Override
	public void create() {
		gradesheet = new Gradesheet();
	}
}