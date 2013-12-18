
/**
 * Create a program that will caculate a students GPA after reading from file.
 * 1. Read data from the given file.
 * 2. Calculate the course points for a given letter and its associated credits.
 *  a. assign a value to the given letter grade.
 *  b. calculater the course points (grade point x credits)
 *  c. calculate the total points (the sum of all the course points)
 *  d. calculate overal GPA (total points x total credits)
 * 3. Display the total number of credits and the overal GPA
 * 
 * @author Kyle Head
 * @version 11/15/10
 */
import java.util.Scanner;
import java.io.*;
public class HW9
{
    public static void main(String[] args) throws IOException    {
        Scanner input = new Scanner(System.in);
        String fileName = "/home/faculty/hu1g/180/hw9data";
        input = new Scanner(new File(fileName));
        double points = 0, totalGrade = 0, totalCredits = 0;
        
        getGrade(input);
        getCredits(input);
        displayGpa(totalGrade, totalCredits, input);
        System.out.print(totalGrade);

    }
    
    public static double getGrade(Scanner input)    {
        String grade = input.nextLine();
        double points = 0, totalGrade = 0;   
        while(input.hasNext()){
            if (grade=="A"){
                points = 4.0;
            }
            else if (grade=="A-"){
                 points = 3.7;
                }
            else if (grade=="B+"){
                 points = 3.3;
                }
            else if (grade=="B"){
                 points = 3.0;
                }
            else if (grade=="B-"){
                 points = 2.7;
                }
            else if (grade=="C+"){
                 points = 2.3;
                }
            else if (grade=="C"){
                 points = 2.0;
                }
            else if (grade=="C-"){
                 points = 1.7;
                }
            else if (grade=="D+"){
                 points = 1.3;
                }
            else if (grade=="D"){
                 points = 1.0;
                }
            else if (grade=="D-"){
                 points = 0.7;
                }
            else if (grade=="E"){
                 points = 0.0;
                }
            else if (grade=="W"){
                 points = 0.0;
                }
            else if (grade=="I"){
                 points = 0.0;
                }
            
            totalGrade += points;
        }
            return totalGrade;
        }
        
    public static double getCredits(Scanner input)    {
        double number = input.nextDouble(), credits = 0, totalCredits = 0;
        while (input.hasNext()){
            if (number == 4){
                credits = 4;
            }
            else if (number == 3){
                credits = 3;
            }
            else if (number == 3){
                credits = 2;
            }
            else if (number == 3){
                credits = 1;
            }
            else if (number == 3){
                credits = 0;
            }
            totalCredits += credits;
        }
        return totalCredits;
        }
    
    public static void displayGpa(double totalGrade, double totalCredits, Scanner input){
        double gpa = totalGrade / totalCredits;
        String schedule = " ";
        while(input.hasNext()){
            schedule += input.nextLine();
        }
        System.out.println("Your original schedule is: ");
        System.out.println(schedule);
        System.out.println("Your total course points are: " + ".");
        System.out.println("Your total points are: " + totalGrade + ".");
        System.out.println("Your overall GPA is " + gpa + ".");
    }
    }
