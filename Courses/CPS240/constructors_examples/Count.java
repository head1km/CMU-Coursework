/**
 * Count
 * 
 * @author albee
 *
 * @version version
 *
 * Aug 28, 2011
 * 
 */
package edu.cmich.cps.cps240.albee1pb.examples.constructors;

/**
 * Provides a simple example for overloaded constructors.
 *
 * @author albee
 */
public class Count {
	int count;
	
	
	/**
	 * Zero argument constructor for class Count. Constructs an instance of
	 * Count where the value of count has been implicitly set.
	 * 
	 * This constructor implicitly calls super().
	 */
	public Count(){
		count = 0;
	}
	
	/**
	 * Parameterized constructor for class Count. Constructs an instance of
	 * Count where the value of count has been explicitly set.
	 * 
	 * This constructor explicitly calls super.
	 * @param count The initial count value.
	 */
	public Count(int count){
		super();
		this.count = count;
	}
}
