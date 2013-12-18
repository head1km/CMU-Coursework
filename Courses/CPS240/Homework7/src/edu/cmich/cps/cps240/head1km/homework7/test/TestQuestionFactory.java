/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.homework7.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import edu.cmich.cps.sps240.head1km.homework7.Question;
import edu.cmich.cps.sps240.head1km.homework7.QuestionFactory;

public class TestQuestionFactory {
	Map<Object, Question> questions = new HashMap<Object, Question>();
	QuestionFactory questionFactory = new QuestionFactory();
	@Test
	public void testGetQuestion() {
		String frank = "Who is frank?";
		Question quest;
		quest = questionFactory.getQuestion(frank);
		assertEquals(frank,quest.getDescription());
	}

	@Test
	public void testGetTotalQuestionsMade() {
		assertEquals(1, questionFactory.getTotalQuestionsMade());
	}

}
