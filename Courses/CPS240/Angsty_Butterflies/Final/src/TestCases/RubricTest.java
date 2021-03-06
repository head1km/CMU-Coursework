package TestCases;
/**
 * Roxanne Harris, Alexander Brya, Kyle Head, Ben Lubitz
 * Kyle Head
 * CPS 240
 * Assignment 8
 */


import static org.junit.Assert.*;

import org.junit.Test;

import angsty_Butterflies.Rubric;

public class RubricTest {

	Rubric myRubric = new Rubric();
	String desc1 = "This is question 1.";
	String desc2 = "This is question 2.";
	String desc3 = "This is question 3.";
	int points1 = 5;
	int points2 = 8;
	int points3 = 10;
	
	@Test
	public void testCreateQuestion() {
		myRubric.createQuestion(desc1, points1);
		myRubric.createQuestion(desc2, points2);
		myRubric.createQuestion(desc3, points3);
		assertNotNull("NO questions created.", Rubric.questions);
	}

}
