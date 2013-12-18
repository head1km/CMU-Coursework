/*
 * Shape
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 11, 2011
 * 
 */
package gof.bridge;

/**
 * @author albee
 *
 * @version $Id$
 * 
 * From http://en.wikipedia.org/wiki/Bridge_pattern
 * 
 */
/** "Abstraction" */
interface Shape {
   public void draw();                             // low-level
   public void resizeByPercentage(double pct);     // high-level
}