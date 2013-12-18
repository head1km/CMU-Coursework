
/**
 * Thiss homework assignment is to solve the quadratic equation using multiple methods.
 * 1. Display the equation 
 *  a. ask the user for the coefficients to the equation.
 * 2. Check if the equation has real solutions. 
 *  a. if true then continue solving the problem.
 *  b. if false then display that there are no real solutions, and end the program.
 * 3. calculate a solution.
 *  a. One method for each solution.
 * 4. display the two solution. 
 *  a. One method for each answer.
 * 
 * @author Kyle Head 
 * @version 11/7/10
 */
    import java.util.Scanner;
    import java.text.DecimalFormat;
public class HW8
{
    public static void main(String[] args)
    {
        double a, b, c;
        double x1 = 0, x2 = 0;
       
        Scanner kb = new Scanner(System.in);
        System.out.println("The Quadratic equation is ax^2 + bx + c = 0");
        System.out.println("Input variables for a, b, and c: ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();
        
        Check(a, b, c);
        calculate(a, b, c);
        calculate2(a, b, c);
        
        
    }
    // Checks if there are possible solutions
    private static void Check(double a, double b, double c){
        double discrim;
        discrim = ((b * b) - (4 * a * c));
        if(discrim > 0){
            System.out.println("Solutions can be found");
        }
        else{
            System.exit(1);
        }
    }
    //Calculates the first solution
    private static void calculate(double a, double b, double c){
        double x1, d, e;
        d = (( b * b ) - ( 4 * a * c ));
        e = Math.sqrt(d);
        x1 = (-b + e)/(2 * a);
        
        displayAnswer(x1);
    }
    //Calculates the second solution
     private static void calculate2(double a, double b, double c){
        double x2, d, e;
        d = (( b * b ) - ( 4 * a * c ));
        e = Math.sqrt(d);
        x2 = (-b - e)/(2 * a);
        
        displayAnswer2(x2);
    }
    //Displays the results for the first solution
    private static void displayAnswer(double x1){
        DecimalFormat formatter = new DecimalFormat("0.00");
        System.out.println("x1 = " + formatter.format(x1));
    }
    //Displays the results for the second solution
    private static void displayAnswer2(double x2){
          DecimalFormat formatter = new DecimalFormat("0.00");
          System.out.println("x2 = " + formatter.format(x2));
    }


}
