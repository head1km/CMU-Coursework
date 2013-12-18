/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.hw07.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Assignment;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Course;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Question;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.QuestionFactory;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Student;

public class TestRubric {
	Question[] questions = new Question[50];
	QuestionFactory questionFactory = new QuestionFactory();
	int questionsMade = 0;
	public Course course = new Course();
	public Assignment assign = new Assignment();
	public Student stud = new Student(); 

	// tests if a new question can be made.
	@Test
	public void testMakeQuestions() {
		String questionName = "Hey ya!";
		questions[questionsMade] = questionFactory.getQuestion(questionName);
		assertNotNull(questions[questionsMade]);	}

	// Tests if values will print out correctly.
	@Test
	public void testPrint() {
		int size = questionFactory.getTotalQuestionsMade();
		String studentName = stud.getName();
		String courseName = course.getName();
		String term = course.getTerm();
		String crn = course.getCrn();
		String assignNumber = assign.getNumber();
		String assignIssue = assign.getIssued();
		String assignDue = assign.getDue();
		String assignDescrip = assign.getDescription();
		
		System.out.printf("Name: %10s\n Course: %10s\nTerm: %10s\nCRN: %10s\nAssignment #%10s\n" +
				"Issued: %10s\nDue: %10s\nDescription: %10s",
				studentName, courseName, term, crn, assignNumber, assignIssue, assignDue, assignDescrip);
		for(int i = 1; 1 < size;i++){
			System.out.printf("%10s...........%2d / %2d\nComment: %10s",questions[i].getDescription(), questions[i].getValue(),
					questions[i].getValue(), questions[i].getComment());
		}	}

}
