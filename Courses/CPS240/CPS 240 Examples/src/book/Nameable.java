/*
 * Namable
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Sep 13, 2011
 * 
 */
package book;

/**
 * Defines the requirements for an object that implements the Nameable interface.
 * 
 * @author Matt Weisfeld
 *
 * @version $Id$
 */
public interface Nameable {
	/**
	 * Gets this object's name.
	 * 
	 * @return The name of the object.
	 * 
	 * @see #setName
	 */
    public abstract String getName();
    /**
     * Sets this object's name.
     * @param name The new name for the object.
     * 
     * @see #getName
     */
    public abstract void setName(String name);

}
