package edu.cmich.head1km.quicksort;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author kyle head
 *
 */
public class myMain {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * 
	 * main is used as a test for the quicksort program. this is done by putting data read from a file
	 * into an array and then calling the quicksort class to perform a quicksort.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		QuickSort intSort = new QuickSort();
		int size = 0;
		int[] numbers = new int[35];
		File ffile = new File("!insert file here!");
		Scanner scan = new Scanner(ffile);
		
		System.out.println("Numbers to be sorted.");
		while(scan.hasNext()) { 
			numbers[size] = scan.nextInt();
			System.out.println(numbers[size]);
			size++;
		}
		System.out.println("now to quicksort"); 
		intSort.sort(numbers);
		for(int i = 0;i < numbers.length;i++){
	        System.out.println(numbers[i]);
	            }

	}

}
