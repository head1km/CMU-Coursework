import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declaration of variables
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		//takes the next input from the user and then displays them back to the user
		num1 = sc.nextInt();
		System.out.print(num1 + " ");
		num2 = sc.nextInt();
		System.out.println(num2);
		
		//tells the user if the entered integers are equal or larger than each other
		if(num1 > num2){
			System.out.println(num1 + " is larger than " + num2);
		}
		else if(num1 == num2){
			System.out.println(num1 + " is equal to " + num2);	
			}
		else{
			System.out.println(num1 + " is smaller than " + num2);
			//if the first number is smaller than the second a while loop is activated
			while(num1 <= num2){
				//will tell the user if the number is divisible by 5, 3, or both 3 and 5 if the conditions are met
				if(num1 % 3 == 0){
						if(num1  % 5 == 0){
							System.out.print("Div by 3 and 5\n");
						}
						else
							System.out.print("Div by 3\n");
					
				}
				else if(num1 % 5 == 0) {
						if(num1 % 3 == 0){
							System.out.print("Div by 3 and 5\n");
						}
						else
							System.out.print("Div by 5\n");
				}
				else if((num1 % 3 == 0 && num1 % 5 == 0 )){
					System.out.print("Div by both 3 and 5\n");
					
				}
				else if(num1 % 3 != 0 && num1 % 5 != 0){
					System.out.println(num1);
				}
				//adds one to the original number until it is equal to the second number
				num1++;	
			}
			
		}
	}
}
