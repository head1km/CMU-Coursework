/*
 * Memory
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 27, 2011
 * 
 *  From : http://en.wikipedia.org/wiki/Facade_pattern
 */
package gof.facade;

/**
 * @author albee
 *
 * @version $Id$
 */
public class Memory {
	    public void load(long position, byte[] data) {
	    		System.out.println("Memory.load("+position+", "+data+")");
	    }
	}
	 

