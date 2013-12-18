import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author khead90
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		int size = 0;
		int[] numbers = new int[15];
		File ffile = new File("!insert file name here!");
		Scanner scan = new Scanner(ffile);
		
		System.out.println("A random list of numbers.");
		for(int j=0; scan.hasNext(); j++) { 
		numbers[j] = scan.nextInt();
		System.out.println(numbers[j]);
		size++;
		}
		Heap intHeap = new Heap(numbers);
		intHeap.sort();
		System.out.println("now to put them in a heap");
		for(int i = 0;i < numbers.length;i++){
	        System.out.println(numbers[i]);
	            }
	}

}
