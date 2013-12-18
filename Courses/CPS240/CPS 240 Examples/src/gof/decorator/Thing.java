/*
 * Thing
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
 * A PrintableThing that contains static text to be printed.
 * @author albee
 *
 * @version $Id$
 */
public class Thing extends PrintableThing {
	private String body;
	
	/**
	 * A piece of static text.
	 * @param body The text to be printed.
	 */
	public Thing(String body) {
		super();
		this.body = body;
	}

	/**
	 * @see gof.decorator.PrintableThing#print()
	 */
	@Override
	public String print() {
		return this.body;
	}

}
