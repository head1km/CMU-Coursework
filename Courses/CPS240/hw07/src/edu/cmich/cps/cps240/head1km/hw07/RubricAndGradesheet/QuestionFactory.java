/*
 * @author Kyle Head
 * CPS 240
 * due 10/26/11
 */
package edu.cmich.cps.cps240.head1km.hw07.RubricAndGradesheet;

import java.util.HashMap;
import java.util.Map;


public class QuestionFactory {
	Map<Object, Question> questions = new HashMap<Object, Question>();

	//gets a called question if it exists, if not it makes it.
	public Question getQuestion(String questionName) {
		Question question = questions.get(questionName);
		if (question == null) {
			question = new Question(questionName);
			questions.put(questionName, question);
		}
		return question;

	}
	
	//returns the total amount of questions.
	public int getTotalQuestionsMade() {
		return questions.size();
	}
}