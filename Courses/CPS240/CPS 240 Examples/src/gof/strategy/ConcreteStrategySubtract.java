/*
 * ConcreteStrategySubtract
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 11, 2011
 * 
 */
package gof.strategy;

/**
 * @author albee
 *
 * @version $Id$
 * From http://en.wikipedia.org/wiki/StrategyPattern
 */
class ConcreteStrategySubtract implements Strategy {
	 
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategySubtract's execute()");
        return a - b;  // Do a subtraction with a and b
    }
}