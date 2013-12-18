/*
 * Shout
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
 * Shouts a PrintableThing.
 * 
 * Shouting is test that is in ALL CAPS and is considered rude.
 *  
 * @author albee
 *
 * @version $Id$
 */
public class Shout extends ThingDecorator {

	/**
	 * Construct a ThingDecorator for shouting.
	 * @param component The PrintableThing to be shouted.
	 */
	public Shout(PrintableThing component) {
		super(component);
	}

	/**
	 * Generates a shouted string.  
	 * @see gof.decorator.ThingDecorator#print()
	 * 
	 * @return shouted string
	 */
	@Override
	public String print() {		
		return super.print().toUpperCase();
	}

}
