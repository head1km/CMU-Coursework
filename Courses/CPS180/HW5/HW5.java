 import java.util.Scanner;
 import java.text.DecimalFormat;
/**
 *Master the use of If and Switch statements. this is done by asking a user where they would like to go to for vacation and where they are staying once they get there.
 *the trip's cost is then calculated for the user. 
 * 
 * Kyle Head
 * 10/4/10
 */
public class HW5
{


    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");
        //variable declaration
        int destination, travelType, hotel;
        double total;
        double travelCost = 0;
        double hotelCost = 0;
        double meal = 0;
        
        //asking where the user is going and where they would like to stay at
        System.out.print("You can go to:\n 1)Niagra Falls\n 2)Chicago\n 3)San Francisco\n 4)Las Vegas\n 5)St. Louis\n");
        System.out.println("Where would you like to go Karen? Please choose 1,2,3,4, or 5.");
        destination = keyboard.nextInt();
        
        switch(destination)
        {
            case 1 : travelCost = (257 / 24) * 2.89;
                System.out.print("Your travel costs are $" + formatter.format(travelCost));
                break;
            case 2 : travelCost = (303 / 24) * 2.89;
                System.out.print("Your travel costs are $" + formatter.format(travelCost));
                break;
            case 3 : travelCost = 630;
                System.out.print("Your travel costs are $" + formatter.format(travelCost));
                break;
            case 4 : travelCost = 415;
                System.out.print("Your travel costs are $" + formatter.format(travelCost));
                break;
            case 5 : System.out.print("Would you like to 1)fly or 2)drive? Please choose 1 or 2.");
                     travelType = keyboard.nextInt();
             if (travelType <= 1)
                {travelCost = 290;
                System.out.print("Your travel costs are $" + formatter.format(travelCost));}
             else {
                travelCost = (551 / 24) * 2.89;
                System.out.print("Your travel costs are $" + formatter.format(travelCost));}
                break;
             default : System.exit(0);
            }
        
        System.out.println("\nWhich hotel would you like to stay at:\n 1)Budgetel\n 2)Holiday Inn\n 3)Sheraton\n 4)Hyatt\n Please choose 1,2,3,4,or 5.");
        hotel = keyboard.nextInt();
        
        switch(hotel)
        {
            case 1 : hotelCost = 76;
                System.out.print("Your hotel cost is $" + formatter.format(hotelCost) + " per day\n");
                break;
            case 2 : hotelCost = 109;
                System.out.print("Your hotel cost is $" + formatter.format(hotelCost) + " per day\n");
                break;
            case 3 : hotelCost = 138;
                System.out.print("Your hotel cost is $" + formatter.format(hotelCost) + " per day\n");
                break;
            case 4 : hotelCost = 215;
                System.out.print("Your hotel cost is $" + formatter.format(hotelCost) + " per day\n");
                break;
            default : System.exit(0);
        }
        
              switch(destination)
        {
            case 1 : meal = 31;
                break;
            case 2 : meal = 52;
                break;
            case 3 : meal = 52;
                break;
            case 4 : meal = 52;
                break;
            case 5 : meal = 52;
                break;
            default : System.exit(0);
        }
       
        //trip total
        total = travelCost + (hotelCost *3) + (meal *3);
        System.out.print("Your total costs for the trip are $" + formatter.format(total) + " which include: travel costs, hotel costs, and meal costs.");
    }
}
