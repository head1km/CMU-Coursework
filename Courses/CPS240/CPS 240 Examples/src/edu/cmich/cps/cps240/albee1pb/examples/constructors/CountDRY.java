/**
 * CountDRY
 * 
 * @author albee
 *
 * @version version
 *
 * Aug 28, 2011
 * 
 * This example demonstrates the DRY principle when there are multiple contructors  
 */
package edu.cmich.cps.cps240.albee1pb.examples.constructors;

/**
 * Provides a simple example for overloaded constructors that complies with
 * the <a href="http://c2.com/cgi/wiki?DontRepeatYourself">DRY</a> principle.
 *
 * @author albee
 * @version $Id: CountDRY.java 200 2011-09-29 23:32:30Z albee1pb@CENTRAL.CMICH.LOCAL $
 */
public class CountDRY {
	private int count;
	private static int shared_count = 0;
	
	/**
	 * Zero argument constructor for class CountDRY. Constructs an instance of
	 * Count where the value of count has been implicitly set.
	 * 
	 * This constructor calls the parameterized constructor.
	 * 
	 * @throws IllegalArgumentException
	 */
	public CountDRY() throws java.lang.IllegalArgumentException {
		this(0);
	}
	
	/**
	 * Parameterized constructor for class CountDRY. Constructs an instance of
	 * Count where the value of count has been explicitly set.
	 * 
	 * This constructor explicitly calls super.
	 * @param count The initial count value.
	 * @throws IllegalArgumentException
	 */
	public CountDRY(int count) throws IllegalArgumentException {
		super();
		if(count < 0){
			throw new IllegalArgumentException("count must not be negative.");
		}
		CountDRY.shared_count += 1;
		this.count = count;
	}

	
	/**
	 * Generates a string representation of an object instance.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CountDRY [count=" + this.count +", shared_count=" + CountDRY.shared_count +"]";
	}

	/**
	 * Test driver.
	 * @param args Ignored.
	 */
	public static void main(String[] args){
		CountDRY cd = null;
		
		try {
			cd = new CountDRY(-10);
			System.out.println(cd);
		} catch (IllegalArgumentException e){
			System.out.println(e);
		} finally {
			System.out.println("new CountDRY(-10) done.");
		}

		try {
			cd = new CountDRY(0);
			System.out.println(cd);
		} catch (IllegalArgumentException e){
			System.out.println(e);
		}

		try {
			cd = new CountDRY(10);
			System.out.println(cd);
		} catch (IllegalArgumentException e){
			System.out.println(e);
		}
	}
}
