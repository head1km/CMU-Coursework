/*
 * CoffeeFlavor
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
//ConcreteFlyweight object that creates ConcreteFlyweight 
public class CoffeeFlavor implements CoffeeOrder {
 String flavor;

 CoffeeFlavor(String newFlavor) {
     flavor = newFlavor;
 }

 public String getFlavor() {
     return this.flavor;
 }

 public void serveCoffee(CoffeeOrderContext context) {
     System.out.println("Serving Coffee flavor " + flavor + " to table number " + context.getTable());
 }
}