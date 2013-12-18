
/**
 * The purpose of this program is to use arrays and methods to calculate and display
 * mean, standard deviation, and displays scores with letter grades assigned to each.
 * 
 * 1) Read data from file and create an array.
 * 2) Calculate and return the mean of a given array of numbers and the logical size
 * of the array.
 * 3) Calculate and return the standard deviation of a given array and its logical size.
 * 4) Assign letter grades for each number in the array and its corresponding mean and
 * standard deviation.
 * 5) Display the scores along with their letter grades.
 * 
 * @author Kyle Head
 * @version 12/03/10
 */
import java.util.Scanner;
import java.io.*;
import java.math.*;
public class HW10
{
    public static void main (String[] args) throws IOException{
        //Scanner that calls data
        Scanner input = new Scanner(System.in);
        String fileName = "/home/faculty/hu1g/180/hw10data";
        input = new Scanner(new File(fileName));
        //variables
        int maxSize = 50;
        double[] values = new double [maxSize];
        //fills array and finds size
        int size = fillArray(input, values);
        System.out.printf("There are %d scores.\n", size);
        //calculates the mean of the scores
        double mean = average(values, size);
        System.out.printf("The total mean = %.2f\n", mean);
        //caculates the standard deviation
        double sd = deviation(input, values, size, mean);
        System.out.printf("The standard deviation = %.2f\n", sd);
        //displays scores and assigns letter grades to each one
        displayScores(values, size, mean, sd);
    }
    private static int fillArray(Scanner input, double[] values){
        double maxSize = 50;
        int size = 0;
        while (input.hasNext() && size < maxSize){
            values[size] = input.nextDouble();
            size ++;
        }
        return size;
    }
    
    private static double average(double[] values, int size){
        double sum = 0;
        for (int k = 0;k < size;k++){
            sum += values[k];
        }
        return sum / size;
    }
    
    private static double deviation(Scanner input, double[] values, int size, double mean){
        double maxSize = 50;
        double sum = 0;
        for (int k = 0; k < size; k++){
            sum += Math.pow((values[k] - mean), 2);
        }
        double sd = Math.sqrt(sum/size);
        return sd;
    }
    
    private static void displayScores(double[] values, int size,double mean, double sd){
        for (int k = 0; k < size; k++){
            if (values[k]< (mean-(1.3*sd))){
                String grade = "E";
                System.out.printf("Your score is a %.0f, which is an " + grade + "\n", values[k]);
            }
            if ((mean - (1.3*sd)) <= values[k] && values[k]< (mean-(.5*sd))){
                String grade = "D";
                System.out.printf("Your score is a %.0f, which is a " + grade + "\n", values[k]);
            }
            if ((mean - (.5*sd)) <= values[k] && values[k]< (mean+(.25*sd))){
                String grade = "C";
                System.out.printf("Your score is a %.0f, which is a " + grade + "\n", values[k]);
            }
            if ((mean + (.25*sd)) <= values[k] && values[k]< (mean+(.75*sd))){
                String grade = "B";
                System.out.printf("Your score is a %.0f, which is a " + grade + "\n", values[k]);
            }
                    if ((mean + (.75 * sd)) <= values[k]){
                String grade = "A";
                System.out.printf("Your score is a %.0f, which is an " + grade + "\n", values[k]);
            }
        }
    }
}
