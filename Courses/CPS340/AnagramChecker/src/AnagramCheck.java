import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kyle Head
 * CPS 340
 * 1/29/12
 *
 *This program reads in two words and checks to see if
 *they are anagrams of each other. An anagram is a set 
 *of words that are composed of the same characters. My
 *program asks the user to input two different words and
 *then checks to see if they are indeed anagrams. 
 *
 *The program compares the two words by first splitting 
 *each string into a character array. The arrays are then
 *sorted into alphabetical order. A comparison is then made 
 *between the two arrays and if all of the characters match
 *the program will report that the words are an anagram. 
 */
public class AnagramCheck {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("Hello, to check if a word" +
		" is an anagram\nplease input two words.");
	 Scanner read = new Scanner(System.in);  
	 System.out.println("Type the first word");
	 String s1 = read.next();
	 s1.toLowerCase();
	 System.out.println("Type the second word");
	 String s2 = read.next(); 
	 s2.toLowerCase();
	 System.out.print("Are these words equal? "+compare(s1,s2));
    }
    
    /**
     * @param s1 the first word
     * @param s2 the second word
     */
    public static boolean compare(String s1, String s2){
	int sizea = s1.length();
	int sizeb = s2.length();
	char[] a = new char[sizea];
	char[] b = new char[sizeb];
	
	a= s1.toCharArray();
	b= s2.toCharArray();
	if(a.length==b.length){
	    Arrays.sort(a);
	    Arrays.sort(b);
	    for(int i=0;i<a.length-1;i++){
		if(a[i]!=b[i])return false;
	    }
	}
	return true;
    }

}
