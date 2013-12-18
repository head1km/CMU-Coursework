package edu.cmich.cps.cps340.head1km.Middle_School_Method;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kyle Head
 * CPS 340
 * 1/25/12
 * 
 * This program generates the Greatest common factor of two integers.
 * The program asks the user for two inputs, positive integers, and 
 * then computes the gcd. The program will display the factors for each
 * of the two integers. Finally the program displays what the gcd is for the 
 * two integers. 
 * 
 * The program works by utilizing the Sieve of Eratosthenes to produce all 
 * of the prime numbers for both integers and then puts them into a seperate 
 * array only if they evenly divide into the number entered. Once this is done 
 * the arrays created by the sieve for each of the two integers are compared 
 * and if there are values that are in common for both arrays then these values 
 * are placed into a new array called primes. The contents of this array are then
 * multiplied together to create a gcd for the two integers that were queried.  
 */
public class MiddleSchoolMain {

    /**
     * @param args
     * 
     */
    public static void main(String[] args) {
	int m = 0, n = 0, gcd;
	Scanner s = new Scanner(System.in);

	System.out
		.println("To find the GCD of two nonzero integers, type two numbers seperated by a blank space.");
	
	try {
	    m = s.nextInt();
	    n = s.nextInt();
	} catch (Exception e) {
	    System.err.println("Invalid entry, please enter two integers seperated by a blank space");
	    System.exit(0);
	}
	System.out.println("You entered " + m + " and " + n + ".");
	gcd = getgcd(m, n);
	System.out.println("The GCD is " + gcd);

    }

    /**
     * @param n the number to apply the sieve to
     * @return L an array of primes
     */
    private static ArrayList<Integer> sieve(int n) {
	ArrayList<Integer> L = new ArrayList<Integer>();
	ArrayList<Integer> A = new ArrayList<Integer>();
	int p, j, root = (int) Math.sqrt(n);

	for (p = 0; p <= n - 2; p++) {
	    A.add(p + 2);
	}
	for (p = 2; p <= root; p++) {
	    if (A.get(p - 2) != 0) {
		j = A.get(p - 2) * A.get(p - 2);
		while (j <= n) {
		    A.set(j - 2, 0);
		    j = j + p;
		}
	    }
	}
	for (p = 2; p <= n; p++) {
	    if (A.get(p - 2) != 0 && n % A.get(p - 2) == 0) {
		L.add(A.get(p - 2));
		System.out.println(A.get(p-2));
	    }
	}
	for (p = 2; p <= n / p; p++) {
	    while (n % p == 0) {
		L.add(p);
		n /= p;
	    }
	}
	if (n > 1) {
	    L.add(n);
	}
	return L;
    }

    /**
     * @param m the first integer entered
     * @param n the second integer entered
     * @return gcd the greatest common denominator of the two integers
     */
    private static int getgcd(int m, int n) {
	System.out.println("The factors for the first integer:");
	ArrayList<Integer> primem = sieve(m);
	System.out.println("The factors for the second integer:");
	ArrayList<Integer> primen = sieve(n);
	ArrayList<Integer> primes = new ArrayList<Integer>();
	int p, gcd = 1;

	for (p = 0; p < primem.size() -1; p++) {
	    if (primem.get(p) == primen.get(p)) {
		if (m % primem.get(p) == 0 && n % primen.get(p) == 0) {
		    primes.add(primem.get(p));
		}
	    }
	}

	for (p = 0; p < primes.size() - 1; p++) {
	    if (primes.size() == 1) {
		gcd = primes.get(p);
	    } else {

		gcd = primes.get(p) * gcd;
	    }
	}
	return gcd;
    }
}
