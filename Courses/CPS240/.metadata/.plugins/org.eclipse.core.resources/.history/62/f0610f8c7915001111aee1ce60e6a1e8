/**
 * Roxanne Harris, Alexander Brya, Kyle Head, Ben Lubitz
 * Kyle Head
 * CPS 240
 * Assignment 8
 */
package angsty_Butterflies;
import java.util.HashMap;
import java.util.Map;

//QuestionFactory creates a hashmap that stores questions. 
public class QuestionFactory {
	Map<String, Question> questions = new HashMap<String, Question>();

	/**
	 * gets a question if it exists, otherwise it will make a new question.
	 * @param qDescription
	 * @param possiblePts
	 * @return aQuestion
	 */
	public Question getQuestion(String qDescription, int possiblePts) {
		Question aQuestion = questions.get(qDescription);
		if (aQuestion == null) {
			aQuestion = new Question(qDescription, possiblePts);
			questions.put(qDescription, aQuestion);
		}
		return aQuestion;
	}

	/**
	 * Returns the total amount of questions in the hashmap.
	 * @return the size of the question.
	 */
	public int getTotalQuestions() {
		return questions.size();
	}
}