/*
 * CoffeeOrderContext
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 13, 2011
 * 
 * 
 * From : http://en.wikipedia.org/wiki/Flyweight_pattern
 * 
 */
package gof.flyweight;

/**
 * Provides the context for a CoffeeOrder.
 * 
 * @author albee
 *
 * @version $Id$
 * 
 * @see CoffeeOrder
 */
public class CoffeeOrderContext {
		/**
		 * Extrinsic property for a CoffeeOrder.
		 */
	   int tableNumber;
	 
	   CoffeeOrderContext(int tableNumber) {
	       this.tableNumber = tableNumber;
	   }
	 
	   public int getTable() {
	       return this.tableNumber;
	   }
	}