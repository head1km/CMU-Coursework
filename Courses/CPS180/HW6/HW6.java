
/**
 * Create a program that will generate 150 random integers between 0 and 999. Then using the random integers create 
 * a histogram that displays the frequency of which each digit occurs. 
 * 
 * 1. assign ten different variables for each of the ten digits.
 * 2. next assign variables for the random number, and three variables for each of the three digits.
 * 3. repeat the process of generating the number, spliting it into three digits, and finding the frequency of each
 * of the three digits, 150 times. 
 * 4. for each digit store the number of times it appears. then display the digit and how many times it appears.
 * next display how many times it exists using * to form a bar.
 * 
 * Kyle Head 
 * 10/12/10
 */
import java.util.Scanner;
public class HW6
{
    public static void main(String[] args)
    {
       //variable declaration
        int number, digit1, digit2, digit3;
        int nil = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        number = 0;
        int n = 0;
        int count = 0;
        
        //generate random numbers
        for (int i = 0; i < 150; i++) 
        {
        number = (int)(Math.random() * 999);
        count = n++;
        digit1 = number % 10;
        digit2 = (number/10) % 10;
        digit3 = ((number/10)/10) % 10;
        //divide them into different variables
        if (number % 10 == 0)
            nil ++;
            else if(number % 10 == 1)
            one ++;
            else if (number % 10 == 2)
            two ++;
             else if (number % 10 == 3)
            three ++;
             else if (number % 10 == 4)
            four ++;
             else if (number % 10 == 5)
            five ++;
             else if (number % 10 == 6)
            six ++;
             else if (number % 10 == 7)
            seven ++;
             else if (number % 10 == 8)
            eight ++;
             else if (number % 10 == 9)
            nine ++;

                
        if ((number / 10) % 10 == 0)
            nil ++;
            else if((number / 10) % 10 == 1)
            one ++;
            else if ((number / 10) % 10 == 2)
            two ++;
             else if ((number / 10) % 10 == 3)
            three ++;
             else if ((number / 10) % 10 == 4)
            four ++;
             else if ((number / 10) % 10 == 5)
            five ++;
             else if ((number / 10) % 10 == 6)
            six ++;
             else if ((number / 10) % 10 == 7)
            seven ++;
             else if ((number / 10) % 10 == 8)
            eight ++;
             else if ((number / 10) % 10 == 9)
            nine ++;
            
                
        if ((number / 10) % 10 == 0)
            nil ++;
            else if(((number / 10) / 10) % 10 == 1)
            one ++;
            else if (((number / 10) / 10) % 10 == 2)
            two ++;
             else if (((number / 10) / 10) % 10 == 3)
            three ++;
             else if (((number / 10) / 10) % 10 == 4)
            four ++;
             else if (((number / 10) / 10) % 10 == 5)
            five ++;
             else if (((number / 10) / 10) % 10 == 6)
            six ++;
             else if (((number / 10) / 10) % 10 == 7)
            seven ++;
             else if (((number / 10) / 10) % 10 == 8)
            eight ++;
             else if (((number / 10) / 10) % 10 == 9)
            nine ++;
        
        }
        //print out of variables into a histogram
        System.out.println("0(" + nil + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=nil;c++)
        System.out.print("*");
        System.out.println();
    
    }
        System.out.println("1(" + one + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=one;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("2(" + two + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=two;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("3(" + three + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=three;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("4(" + four + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=four;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("5(" + five + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=five;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("6(" + six + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=six;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("7(" + seven + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=seven;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("8(" + eight + ") :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=eight;c++)
        System.out.print("*");
        System.out.println();
    }
            System.out.println("9(" + nine + " :");
        for(int r=1;r<=1;r++){
            for(int c=1;c<=nine;c++)
        System.out.print("*");
        System.out.println();  
}
}
    }
