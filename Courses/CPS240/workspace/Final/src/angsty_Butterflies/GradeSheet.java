/**
 * Roxanne Harris, Alexander Brya, Kyle Head, Ben Lubitz
 * Kyle Head
 * CPS 240
 * Assignment 8
 */
package angsty_Butterflies;


public class GradeSheet {

  protected GradeSheetMetadata gsMetadata;
  double totalScore;
  static private Question[] questions = new Question[50];
  static QuestionFactory qFactory;
  private int questionsMade = 0;
  static qContext[] scores = new qContext[50];
  
  public void calculateScore(String qDescription, int possiblePts, int stuScore, String comment) {
	  questions[questionsMade] = qFactory.getQuestion(qDescription, possiblePts);
	  scores[questionsMade] = new qContext(stuScore, comment);
	  totalScore += scores[questionsMade].getPointsEarned();
	  questionsMade++;
  }
  
  public void calculateScore(String qDescription, int possiblePts, int stuScore) {
	  questions[questionsMade] = qFactory.getQuestion(qDescription, possiblePts);
	  scores[questionsMade] = new qContext(stuScore);
	  totalScore += scores[questionsMade].getPointsEarned();
	  questionsMade++;
  }
  
  public double getScore() {
	  return totalScore;
  }

}