import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Kyle Head
 * This program reads two files and then compares them looking for
 * numbers that are in the target file and the first file. it 
 * impements a  sequential search to find the numbers that
 * both files have in common and then prints them out. 
 */
public class FileSearch {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(new File("/media/head1km/g-drive/Hu/340/randomNumbers"));
	final int size1 = 80000;
	final int size2 = 10000;
	int[] numbers = new int[size1];
	int[] targetNumbers = new int[size2];
	int i = 0;
	int j = 0;
	int k = 0;
	int l;

	while (scan.hasNextInt()) {
	    numbers[i] = scan.nextInt();
	    i++;
	}
	scan.close();
	scan = new Scanner(new File("/media/head1km/g-drive/Hu/340/targetNumbers"));
	while (scan.hasNextInt()) {
	    targetNumbers[j] = scan.nextInt();
	    j++;
	}
	scan.close();
	System.out.println("The numbers that these two files have in common are:");
	for (l = 0; l < size2; l++) {
	    while (numbers[k] != targetNumbers[l])
		k++;
	    if (k < size1)
		System.out.println(numbers[k]);
	}
    }
}