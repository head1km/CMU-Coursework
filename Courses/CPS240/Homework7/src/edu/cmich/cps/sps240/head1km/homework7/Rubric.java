/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.sps240.head1km.homework7;

public class Rubric {
	static Question[] questions = new Question[50];
	static QuestionFactory questionFactory;
	static int questionsMade = 0;
	public Course course = new Course();
	public Assignment assign = new Assignment();
	 

	static void makeQuestions(String questionName) {
		questions[questionsMade] = questionFactory.getQuestion(questionName);
	}

	public void print(){
		int size = questionFactory.getTotalQuestionsMade();
		String courseName = course.getName();
		String term = course.getTerm();
		String crn = course.getCrn();
		String assignNumber = assign.getNumber();
		String assignIssue = assign.getIssued();
		String assignDue = assign.getDue();
		String assignDescrip = assign.getDescription();
		System.out.printf("Course: %10s\nTerm: %10s\nCRN: %10s\nAssignment #%10s\nIssued: %10s\nDue: %10s\nDescription: %10s",
				courseName, term, crn, assignNumber, assignIssue, assignDue, assignDescrip);
		for(int i = 1; 1 < size;i++){
			for(int i = 1; 1 < size;i++){
				System.out.printf("%10s...........%2d / %2d\nComment: %10s",questions[i].getDescription(), questions[i].getValue(),
						questions[i].getValue(), questions[i].getComment());
			}
	}
}
