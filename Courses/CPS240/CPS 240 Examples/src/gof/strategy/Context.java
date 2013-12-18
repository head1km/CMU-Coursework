/*
 * Context
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
 *
 */
//Configured with a ConcreteStrategy object and maintains a reference to a Strategy object
class Context {

 private Strategy strategy;

 // Constructor
 public Context(Strategy strategy) {
     this.strategy = strategy;
 }

 public int executeStrategy(int a, int b) {
     return strategy.execute(a, b);
 }
}

