import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kyle Head
 * 
 * This program sorts an array of disks that alternate between
 * dark and light. The user enters in the desired amount of 
 * disks and the program implements an algorithm to sort the 
 * disks so that all of the dark ones are at the end of 
 * the array and the light ones are at the beginning. 
 */
public class Puzzlesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr;
		int n = 0;
		String l = "light";
		String d = "dark";
		int size = 0;
		int count;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter how many disks are present:");
		size = scan.nextInt();
		arr = new String[size];
		System.out.println("Here is the original order of disks:");
		while (n < size) {
			if (n % 2 == 0) {
				arr[n] = d;
			} else {
				arr[n] = l;
			}
			System.out.println(arr[n]);
			n++;
		}
		System.out.println("\nAnd after sorting they become:");
		count = sort(arr, size);

		System.out.println("This only took " + count + " moves.");
	}

	/**
	 * 
	 * @param arr the array to be sorted
	 * @param size size of the array to be sorted
	 * @return the number of moves that it took to sort the array
	 */
	public static int sort(String[] arr, int size) {
		String[] temp = new String[size];
		int count = 0;
		for (int i = 0; i < size; i++)
			if ((arr[i] == "dark" && i + 1 < size - 1))
				for (int j = 0; j < size - 1; j++) {
					if (arr[j] == "dark" && i + 1 < size - 1) {
						temp[j] = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp[i];
						count++;
					}
				}
		for (int a = 0; a < size; a++) {
			System.out.println(arr[a]);
		}
		return count;
	}
}