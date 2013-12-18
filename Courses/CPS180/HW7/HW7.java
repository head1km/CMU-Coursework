
/**
 * This program will display a basketball team that has played four games this season
 * and then display the players average score and then display the player with the 
 * highest score. 
 * 
 * 1    The program will read information from the file /home/faculty/hu1g/180/hw7data
 * 2    The program will then display a line for each player which will display the 
 * players name, how many points they scored in each game, and the players average score
 * for the whole season so far. 
 * 3    After each player and their data is displayed, the program will display announce
 * who had the highest average score. 
 * 
 * Kyle Head
 *10/26/10
 */
import java.util.Scanner;
import java.io.*;

public class HW7 
{
    public static void main(String[] args) throws IOException {
        
//     File file = new File("/home/faculty/hu1g/180/hw7data");
    File file = new File("C:\\Users\\Kyle\\Documents\\javaText.txt");
    Scanner inf = new Scanner(file);
    
    int gameScore = 0;
    int playerAverage = 0;
    String name = "Player";
    String g1 = "Game 1";
    String g2 = "Game 2";
    String g3 = "Game 3";
    String g4 = "Game 4";
    String g5 = "Game 5";
    String averageScore = "Average Score";
    String playerName = " ";
    int bestAverage = 0 ;
    int count = 0;
    int totalScore = 0;
    String bestName = " ";

    System.out.println("--------------------------------------------------------------------------------");
    while (inf.hasNext()){
        playerName = inf.next();
        gameScore = inf.nextInt();
        System.out.print(playerName + " ");
            while(gameScore != -1)  {
                System.out.print(gameScore + " ");
                totalScore = totalScore + gameScore;
                count = count + 1;
                gameScore = inf.nextInt();
                
            }
            if (count > 0){
            playerAverage = totalScore / count;
        }
        playerAverage = totalScore / count;
        System.out.println("player's average: " + playerAverage);
    }
        if (playerAverage > bestAverage){
            playerName = bestName;
            playerAverage = bestAverage;
    }

    
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("The player with the best average is " + bestName + " with a score of " + bestAverage);
}
}
