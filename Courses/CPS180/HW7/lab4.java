
/**
 * Write a java program to find the name of the state and its population
 * that is the largest in the USA
 * 
 * 1 use the java.io.* Java API package
 * 2 add the throws IOException to the header of the main method
 * 3 create a File object with the given data file
 * 4 create a scanner object with the file
 * 5 declare variables
 *      state
 *      population
 *      largestState
 *      largestPopulation
 * 6 repeat teh following as long as there are data to be read in the file:
 * 7 display the name of the state and its population that is the largest in the data
 *  
 * Title: (Homework or Lab # here)
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner; 
import java.io.*;

public class lab4
{
    /** main method */
    public static void main(String[] args) throws IOException {
        File file = new File("/home/faculty/hu1g/180/lab4data");
        Scanner inf = new Scanner (file);
        
        String state, largestState, smallestState;
        int population, largestPopulation, smallestPopulation, difference;
        largestPopulation = 0;
        largestState = " ";
        smallestPopulation = 999;
        smallestState = " ";
        difference = 0;
        
        while(inf.hasNext()){
            state = inf.next();
            population = inf.nextInt();
            if (population > largestPopulation)
            {    largestPopulation = population;
                 largestState = state;
            }
            if (population < smallestPopulation){
                smallestState = state;
                smallestPopulation = population;
            }
            difference = largestPopulation - smallestPopulation;
        }
        
        System.out.println("The largest state is " + largestState + " and its population is "
        + largestPopulation + ".\n" + "The smallest state is " + smallestState 
        + " and its population is " + smallestPopulation + ".\n" + "The difference in population is " 
        + difference + "."); 

    }
}
