package TestCases;
/**
 * Roxanne Harris, Alexander Brya, Kyle Head, Ben Lubitz
 * Kyle Head
 * CPS 240
 * Assignment 8
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import angsty_Butterflies.GradeSheet;
import angsty_Butterflies.Question;
import angsty_Butterflies.qContext;

public class GradeSheetTest {
	private GradeSheet myGS = new GradeSheet();
	private Question[] questions;
	private qContext[] scores;
	private String qDescription, comment;
	private int possiblePts, stuScore;
	
	@Before
	public void setUp() {
		qDescription = "This is a question.";
		comment = "This is a comment.";
		possiblePts = 5;
		stuScore = 7;
		
	}

	@Test
	public void testCalculateScoreStringIntIntString() {
		myGS.calculateScore(qDescription, possiblePts, stuScore, comment);
		assertNotNull("NO questions created.", questions);
		assertNotNull("NO score recorded.", scores);
		assertTrue("The score is higher than the possible points",
				stuScore <= possiblePts);
		
	}

	@Test
	public void testCalculateScoreStringIntInt() {
		myGS.calculateScore(qDescription, possiblePts, stuScore);
		assertNotNull("NO questions created.", questions);
		assertNotNull("NO score recorded.", scores);
		assertTrue("The score is higher than the possible points",
				stuScore <= possiblePts);
	}

}
