import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kyle Head
 * 
 * 
 */
public class Quicksort {

    /**
     * @param args
     * @throws IOException
     */
    public static int count = 0;
    public static void main(String[] args) throws IOException {
	// String aFileName =
	// "/private/tmp/head1km/General/Hu/340/hw5data/data10";
	// File file = new File(aFileName);
	// Scanner scan = new Scanner(file);
	int[] arr = new int[10];
	
	// for(int i = 0;scan.hasNextInt();i++){
	// arr[i] = scan.nextInt();
	// }
	// scan.close();
	arr[0] = 2345;
	arr[1] = 6756;
	arr[2] = 245;
	arr[3] = 456;
	arr[4] = 6367;
	arr[5] = 453;
	arr[6] = 545;
	arr[7] = 123;
	arr[8] = 2342;
	arr[9] = 2343;

	sort(arr, 0, 9);
	System.out.println("Total comparisons for 10 elements: " + count);
    }
    static int partition(int arr[], int left, int right) {
  	int i = left, j = right;
  	int tmp;
  	int pivot = arr[(left + right) / 2];

  	while (i <= j) {
  	    while (arr[i] < pivot){
  		i++;
  		count++;
  	    }
  	    while (arr[j] > pivot){
  		j--;
  		count++;
  	    }
  	    if (i <= j) {
  		tmp = arr[i];
  		arr[i] = arr[j];
  		arr[j] = tmp;
  		i++;
  		j--;
  	    }
  	}
  	return i;
      }

      static void sort(int arr[], int left, int right) {
  	int index = partition(arr, left, right);
  	if (left < index - 1) {
  	    sort(arr, left, index - 1);
  	}
  	if (index < right) {
  	    sort(arr, index, right);
  	}
      }
}

  