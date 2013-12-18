/*
 * ThingDecorator
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
 * Base class for decorators of PrintableThing.
 * 
 * @author albee
 *
 * @version $Id$
 */
public abstract class ThingDecorator extends PrintableThing {

	private PrintableThing component = null;
	
	/**
	 * Build a printable thing.
	 * @param component The PrintableThing that will be decorated.
	 */
	public ThingDecorator(PrintableThing component) {
		super();
		this.component = component;
	}

	/**
	 * @see gof.decorator.PrintableThing#print()
	 */
	@Override
	public String print() {
		return this.component.print();
	}

}
