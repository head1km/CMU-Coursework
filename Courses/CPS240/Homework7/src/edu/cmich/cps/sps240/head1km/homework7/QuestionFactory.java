/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.sps240.head1km.homework7;

import java.util.HashMap;
import java.util.Map;


public class QuestionFactory {
	Map<Object, Question> questions = new HashMap<Object, Question>();

	public Question getQuestion(String questionName) {
		Question question = questions.get(questionName);
		if (question == null) {
			question = new Question(questionName);
			questions.put(questionName, question);
		}
		return question;

	}
	public int getTotalQuestionsMade() {
		return questions.size();
	}
}