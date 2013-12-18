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
import edu.cmich.cps.sps240.head1km.homework7.Gradesheet;
import edu.cmich.cps.sps240.head1km.homework7.Question;
import edu.cmich.cps.sps240.head1km.homework7.Student;

public class TestGradesheetEditor {

	@Test
	public void testOpen() {
		Gradesheet gradesheet = new Gradesheet();
		assertNull(gradesheet);
	}

	@Test
	public void testEditStudent() {
		String newGlobalid = "head1km";
		String newStudName = "Kyle Head";
		Student stud = new Student();
		
		stud.setGlobalid(newGlobalid);
		stud.setName(newStudName);	
		assertEquals(newGlobalid, stud.getGlobalid());
		assertEquals(newStudName, stud.getName());
		}

	@Test
	public void testEditCourse() {
		String newName = "CPS 240";
		String newCrn = "394498dsu3";
		String newTerm = "Fall";
		Course course = new Course();
		
		course.setCrn(newCrn);
		course.setName(newName);
		course.setTerm(newTerm);	
		assertEquals(newName, course.getName());
		assertEquals(newCrn, course.getCrn());
		assertEquals(newTerm, course.getTerm());
		}

	@Test
	public void testEditAssignment() {
		String newDescription = "hard stuff";
		String newDue = "10/23/11";
		String NewIssued = "10/24/11";
		String newNumber = "4";
		Assignment assign = new Assignment();
		
		assign.setDescription(newDescription);
		assign.setDue(newDue);
		assign.setIssued(NewIssued);
		assign.setNumber(newNumber);	
		assertEquals(newDescription, assign.getDescription());
		assertEquals(newDue, assign.getDue());
		assertEquals(NewIssued, assign.getIssued());
		assertEquals(newNumber, assign.getNumber());
		}

	@Test
	public void testEditQuestions() {
		Question question = new Question(null);
		if(question != null){
		String newComment = "so tired";
		String newDescription = "cryface";
		int newEarned = 10000;
		int newValue = 100;
		
		question.setComment(newComment);
		question.setDescription(newDescription);
		question.setEarned(newEarned);
		question.setValue(newValue);
		}
		else {
			String quest = "ello";
			makeQuestions(quest);
		}	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreate() {
		Gradesheet gradesheet = new Gradesheet();
		assertNotNull(gradesheet);	}

}
