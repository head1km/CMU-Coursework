import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * To get familiar with Java basics.
 * 
 * @author Kyle Head    
 * @version 9/6/2010
 */
public class HW2
{
    public static void main(String[] args)
  
    {
        String name;
        double balance;
        double interestRate;
        double totalBalance;
        double totalBalance2;
        double totalBalance3;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is your name?");
        name = keyboard.nextLine();
        
        System.out.print("How much was your initial balance?");
        balance = keyboard.nextInt();
        
        System.out.print("What is your annual interest rate?");
        interestRate = keyboard.nextDouble();
        
        totalBalance = balance + balance * interestRate;
        totalBalance2 = totalBalance + totalBalance * interestRate;
        totalBalance3 = totalBalance2 + totalBalance2 * interestRate;
        
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println(name + ", here is your account statement:\n");
        System.out.println("Initial Balance:\t\t $" + formatter.format(balance));
        System.out.println("Annual Interest Rate:\t\t     " + interestRate + "\n");
        
        System.out.println("Balance (end of first year):\t $" + formatter.format(totalBalance));
        System.out.println("Balance (end of second year):\t $" + formatter.format(totalBalance2));
        System.out.println("Balance (end of third year):\t $" + formatter.format(totalBalance3) + "\n");
        System.out.println("Have a nice day!");
     }
}
