/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.hw07.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Assignment;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Course;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Question;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Rubric;

public class TestRubricEditor {
//Tests if a rubric can be opened.
	@Test
	public void testOpen() {
		Rubric rubric = new Rubric();
		assertNull(rubric);
	}

	// Tests if course data can be manipulated.
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

	// Tests if assignment data can be manipulated.
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

	//Tests if quesions can be manipulated.
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
// Tests the save ability.
	@Test
	public void testSave() {
		fail("Not yet implemented");
	}
//Creates a new rubric.
	@Test
	public void testCreate() {
		Rubric rubric = new Rubric();
		assertNotNull(rubric);	}


}
