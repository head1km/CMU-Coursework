/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.hw07.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.Question;
import edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet.QuestionFactory;

public class TestQuestionFactory {
	Map<Object, Question> questions = new HashMap<Object, Question>();
	QuestionFactory questionFactory = new QuestionFactory();
	
	// Tests if given a question if the getQuestion class will return a new question.
	@Test
	public void testGetQuestion() {
		String frank = "Who is frank?";
		Question quest;
		quest = questionFactory.getQuestion(frank);
		assertEquals(frank,quest.getDescription());
	}

	// Tests if the method returns the correct value of questions made.
	@Test
	public void testGetTotalQuestionsMade() {
		assertEquals(1, questionFactory.getTotalQuestionsMade());
	}

}
