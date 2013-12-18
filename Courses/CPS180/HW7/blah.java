 import java.util.Scanner;
import java.io.*;

public class PlayerAverage
{
    public static void main(String[] args) throws IOException
    {
      String name = " "; 
      double score = 0; 
      double scoreSum;
      double avg;
      double highAvg = 0;
      int count;    

      File filename = new File("/C:/Documents and Settings/Sherry_Heart/Desktop/Data.txt"); 
      Scanner inputFile = new Scanner(filename); 
      
      while (inputFile.hasNext())   {       
          name = inputFile.next();    
          score = inputFile.nextDouble();
          System.out.print(name + " ");
                 
          while (score != -1)  {   
               System.out.print(score + " ");
               scoreSum = 0;
               count = 0;
               scoreSum = scoreSum + score;
               count = count + 1;
               score = inputFile.nextDouble(); 
            }
              scoreSum = 0;
              count = 0;
              avg = 0;
          if (count > 0) {
              avg = scoreSum/count; }
              
              System.out.println("Player's <span class="searchlite">average</span>: " + avg);
            }
        
              avg = 0;
          if (avg > highAvg) {
              avg = highAvg; }
              
            System.out.println("\nThe highest <span class="searchlite">average</span> score is: " + highAvg);
           
            inputFile.close();
    }
}

