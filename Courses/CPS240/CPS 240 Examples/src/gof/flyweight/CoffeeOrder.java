/*
 * CoffeeOrder
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
 * @author albee
 *
 * @version $Id$
 */
//Flyweight object
public interface CoffeeOrder {
 public void serveCoffee(CoffeeOrderContext context);
}