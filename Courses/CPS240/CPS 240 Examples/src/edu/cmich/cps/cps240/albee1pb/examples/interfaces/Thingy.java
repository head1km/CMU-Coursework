/*
 * Thingy
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Aug 31, 2011
 * 
 */
package edu.cmich.cps.cps240.albee1pb.examples.interfaces;

/**
 * Simple class that demonstrates interfaces.
 * @author albee
 *
 * @version $Id$
 */
public class Thingy implements AnInterface {

	/**
	 * Provides a default constructor.
	 */
	public Thingy() {
		super();
	}

	/**
	 * @see edu.cmich.cps.cps240.albee1pb.examples.interfaces.AnInterface#say_something()
	 */
	@Override
	public String say_something() {
		return "Howdy";
	}
	
	
}
