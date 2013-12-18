/*
 * State
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
interface State { 
    void writeName(StateContext stateContext, String name);
} 