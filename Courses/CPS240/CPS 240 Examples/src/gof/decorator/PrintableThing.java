/*
 * PrintableThing
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Sep 29, 2011
 * 
 */
package gof.decorator;

/**
 * Base PrintableThing for supporting decoration of PrintableThings.
 * 
 * @author albee
 *
 * @version $Id$
 */
public abstract class PrintableThing {
	/**
	 * Generate a string for output.
	 * 
	 * @return The string represented by PrintableThing
	 */
	public abstract String print();
}
