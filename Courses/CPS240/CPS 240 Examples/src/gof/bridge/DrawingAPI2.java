/*
 * DrawingAPI2
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
/** "ConcreteImplementor" 2/2 */
class DrawingAPI2 implements DrawingAPI {
   public void drawCircle(double x, double y, double radius) { 
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
   }
}
 