/*
 * RealImage
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 13, 2011
 * 
 * 
 * From : http://en.wikipedia.org/wiki/Proxy_pattern
 * 
 */
package gof.proxy;

/**
 * @author albee
 *
 * @version $Id$
 */
//on System A 
class RealImage implements Image {
 private String filename;

 public RealImage(String filename) { 
     this.filename = filename;
     loadImageFromDisk();
 }

 private void loadImageFromDisk() {
     System.out.println("Loading   " + filename);
 }

 public void displayImage() { 
     System.out.println("Displaying " + filename); 
 }

}
