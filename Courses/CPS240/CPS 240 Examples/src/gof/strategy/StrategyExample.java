/*
 * StrategyExample
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
 * 
 * From http://en.wikipedia.org/wiki/StrategyPattern
 */
class StrategyExample {
	 
    public static void main(String[] args) {
 
        Context context;
 
        // Three contexts following different strategies
        context = new Context(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3,4);
 
        context = new Context(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3,4);
 
        context = new Context(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3,4);
    }
}
