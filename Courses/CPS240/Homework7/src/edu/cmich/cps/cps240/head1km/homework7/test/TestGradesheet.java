/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.homework7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cmich.cps.sps240.head1km.homework7.Assignment;
import edu.cmich.cps.sps240.head1km.homework7.Course;
import edu.cmich.cps.sps240.head1km.homework7.Question;
import edu.cmich.cps.sps240.head1km.homework7.QuestionFactory;
import edu.cmich.cps.sps240.head1km.homework7.Student;
import edu.cmich.cps.sps240.head1km.homework7.System;

public class TestGradesheet {
	Question[] questions = new Question[50];
	QuestionFactory questionFactory = new QuestionFactory();
	int questionsMade = 0;
	public Course course = new Course();
	public Assignment assign = new Assignment();
	public Student stud = new Student(); 
	
	@Test
	public void testMakeQuestions() {
		
		String questionName = "Hey ya!";
		questions[questionsMade] = questionFactory.getQuestion(questionName);
		assertNotNull(questions[questionsMade]);
	}

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
		}
	}
}
