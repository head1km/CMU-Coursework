import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * To practice with teh selection control sturctures
 * 
 * Kyle Head 
 *9/30/10
 */
public class HW4
{
    public static void main(String[] args)
    {   
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");
        
        final double adultNight = 8.75;
        final double adultDay = 7.00;
        final double child = 6.50;
        String movie1 = "Alpha And Omega";
        String movie2 = "Casablanca";
        String movie3 = "Going The Distance";
        String movie4 = "The Last Exorcism";
        int id1 = 1;
        int id2 = 2;
        int id3 = 3;
        int id4 = 4;
        String movieName = "Movie";
        String eveningPrice = "Adult Price(Evening)";
        String dayPrice = "Adult Price(Day)";
        String childrenPrice1 = "Children Price";
        String id = "Movie id";
        String showing;
        char e = 'e';
        char d = 'd';
        double price, total, total1, payment, change;
        int selectedId;
        int ticketAdult, ticketChild;
        char c;
        
        System.out.println("Welcome to the theater! Our current movies are:");
        System.out.printf("%s %35s %20s %20s %13s\n", movieName, eveningPrice, dayPrice, childrenPrice1, id);
        System.out.printf("%s %15.2f %20.2f %20.2f %20d\n", movie1, adultNight, adultDay,child, id1);
        System.out.printf("%s %20.2f %20.2f %20.2f %20d\n", movie2, adultNight, adultDay,child, id2);
        System.out.printf("%s %12.2f %20.2f %20.2f %20d\n", movie3, adultNight, adultDay,child, id3);
        System.out.printf("%s %13.2f %20.2f %20.2f %20d\n", movie4, adultNight, adultDay,child, id4);
        
         System.out.println("To select a movie enter the movie id.");
        selectedId = keyboard.nextInt();
        if (selectedId == 1)
            System.out.println("You have selected " + movie1);
        else if (selectedId == 2)
            System.out.println("You have selected " + movie2);
        else if (selectedId == 3)
            System.out.println("You have selected " + movie3);
        else if (selectedId == 4)
            System.out.println("You have selected " + movie4);
       
        
        System.out.print("How many adult tickets would you like? ");
        ticketAdult = keyboard.nextInt();
        System.out.print("How many children tickets would you like? ");
        ticketChild = keyboard.nextInt();
            
        showing = keyboard.nextLine();
        System.out.println("Which showing would you like to see?");
        showing = keyboard.nextLine();
        c = showing.charAt(0);
        switch(c){
            case 'e' : price = 8.75;
                break;
            case 'd' : price = 7.00;
                break;
        }
      
        System.out.print("Confirm showing price: ");
        price = keyboard.nextDouble();
        total = (ticketAdult * price)  + (ticketChild * 6.00);
        
            System.out.println("Your total is $" + formatter.format(total));

        
        System.out.print("Enter your payment: $");
        payment = keyboard.nextDouble();
        
        change = payment - total;

        System.out.print("your change is " + "$" + formatter.format(change) + " and here are your " + ticketAdult + 
        " adult tickets and " + ticketChild + " child tickets. Enjoy the show.");
        
    }
}
