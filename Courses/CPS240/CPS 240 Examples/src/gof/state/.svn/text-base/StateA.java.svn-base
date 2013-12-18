/*
 * StateA
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 27, 2011
 * 
 */
package gof.state;

/**
 * @author albee
 *
 * @version $Id$
 */
class StateA implements State { 
    public void writeName(StateContext stateContext, String name) { 
            System.out.println(name.toLowerCase()); 
            stateContext.setState(new StateB()); 
    } 
} 