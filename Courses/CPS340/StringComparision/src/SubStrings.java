/**
 * @author Kyle Head
 * This program uses brute-force techniques to find
 * the total number of substrings starting with A
 * and ending with B. This program has an (n*n) efficiency. 
 */
public class SubStrings {
    /**
     * @param args
     */
    public static void main(String[] args) {
	String aString = "cabaaxbya";
	int size = 0;
	int count = 0;
	char[] charArray = new char[size];

	aString.toLowerCase();
	size = aString.length();
	charArray = aString.toCharArray();
	System.out.println("Here is the array:");
	for (int i = 0; i < size; i++) {
	    System.out.print(charArray[i] + " ");
	}
	count = countchars(charArray, size, count);
	System.out
	.println("\nThe number of substrings that start with A and end with B are "
		+ count);
    }

    /**
     * 
     * @param charArray the array to be searched
     * @param size the size of the array
     * @param count the number of matches found
     * @return count - the total number of matches found
     */
    public static int countchars(char[] charArray, int size, int count){
	for (int i = 0; i < size; i++) {
	    if (charArray[i] == 'a') {
		for (int j = i + 1; j < size; j++) {
		    if (charArray[j] == 'b')
			count++;
		}
	    }
	}
	return count;
    }
}