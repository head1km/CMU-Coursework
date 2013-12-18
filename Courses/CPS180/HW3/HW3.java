import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * to learn more about constants, variable declarations, arithmetic expressions, assignments, input and format output.
 * 
 * @author Kyle Head 
 * @version 9/12/10
 */
public class HW3
{
    public static void main(String[] args)
    {
        //Variables
        double tshirt, candies, chips, coke;//the main products of the store
        double deposit;//deposit number
        double tshirtDiscount, candiesDiscount, chipsDiscount;//15% discounts
        double tshirtCost, candiesCost, chipsCost, cokeCost;//costs of each item
        int tshirtAmount, candiesAmount, chipsAmount, cokeAmount;// how many 
        double subtotal;//subtotal
        double totalTax;//total tax for the sale
        double payment;//how much is paid
        double change;//change owed
        double savings;//total savings due to discount
        double tax;//tax rate
        double total;//total of all items
        
        Scanner keyboard = new Scanner(System.in); //Input scanner
        DecimalFormat formatter = new DecimalFormat("0.00");//decimal format scanner
        //Constants
        tshirtDiscount = 3.88;//tshirt discount
        candiesDiscount = 1.78;//candies discount
        chipsDiscount = 1.30;//chips discount
        tshirt = 12.95;//tshirt cost
        candies = 3.95;//candies cost
        chips = 2.88;//chips cost
        coke = 1.99;//coke cost
        tax = .06;//tax rate
        //string names used throughout the receipt
        String tshirt1 = "T-shirt";
        String candies1 = "Candies";
        String chips1 = "Chips";
        String coke1 = "Coke";
        String deposit1 = "deposit";
        String item = "item";
        String unit = "unit price";
        String many = "how many";
        String cost = "cost";
        String savings1 = "you saved";
        String tax1 = "tax";
        String total1 = "total";
        String subtotal1 = "subtotal";
        String goodbye = "Thank you. Come again!";
        String payment1 = "payment";
        String change1 = "change";
        
        System.out.print("Hello!\n Here are the items we have today:\n");//order taking
        System.out.printf("%10s $%.2f\n", tshirt1, tshirt);// a list of items and their prices
        System.out.printf("%10s  $%.2f\n", candies1, candies);
        System.out.printf("%10s  $%.2f\n", chips1, chips);
        System.out.printf("%10s  $%.2f\n", coke1, coke);
        
        System.out.println("How many T-shirts would you like?");//list of how many of each item the customer wants
        tshirtAmount = keyboard.nextInt();
        System.out.println("How many Candies would you like?");
        candiesAmount = keyboard.nextInt();
        System.out.println("How many Chips would you like?");
        chipsAmount = keyboard.nextInt();
        System.out.println("How much Coke would you like?");
        cokeAmount = keyboard.nextInt();
        System.out.println("What are you paying with?");
        payment = keyboard.nextInt();
        
        tshirtCost = tshirt * tshirtAmount;//calculations
        candiesCost = candies * candiesAmount;
        chipsCost = chips * chipsAmount;
        cokeCost = coke * cokeAmount;
        deposit = 1.20 * 4;
        subtotal = tshirtCost + candiesCost + chipsCost + cokeCost + deposit;
        savings = tshirtDiscount + candiesDiscount + chipsDiscount;
        totalTax = tshirt * tax * tshirtAmount;
        total = subtotal + totalTax - savings;
        change = payment - total;
        
        
        
        System.out.printf("%-10s %15s %15s %15s\n", item, unit, many, cost);//receipt
        System.out.println("---------------------------------------------------------------");
        
        System.out.printf("%-10s %15s %15d %15.5s \n", tshirt1, tshirt, tshirtAmount, formatter.format(tshirtCost));
        System.out.println("                                                    (-3.88)");
        System.out.printf("%-10s %15s %15d %15.5s \n", candies1, candies, candiesAmount, formatter.format(candiesCost));
        System.out.println("                                                    (-1.78)");
        System.out.printf("%-10s %15s %15d %15.4s \n", chips1, chips, chipsAmount, formatter.format(chipsCost));
        System.out.println("                                                    (-1.30)");
        System.out.printf("%-10s %15s %15d %15.4s \n", coke1, coke, cokeAmount, formatter.format(cokeCost));
        System.out.printf("%38s %19s\n\n", deposit1, formatter.format(deposit));
        System.out.printf("%39s %18s\n", subtotal1, formatter.format(subtotal));
        System.out.printf("%40s             (%s)\n", savings1, savings);
        System.out.printf("%34s %23s\n\n", tax1, formatter.format(totalTax));
        System.out.println("                                              -----------------");
        
        System.out.printf("%36s %21s\n\n", total1, formatter.format(total));
        System.out.printf("%38s %19s\n", payment1, formatter.format(payment));
        System.out.printf("%37s %20s\n\n", change1, formatter.format(change));
        System.out.printf("%27s", goodbye);
        
      
    }

  
}
