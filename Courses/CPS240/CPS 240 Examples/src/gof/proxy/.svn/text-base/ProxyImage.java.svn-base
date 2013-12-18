/*
 * ProxyImage
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 13, 2011
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
//on System B 
class ProxyImage implements Image {
  private String filename;
  private RealImage image;

  public ProxyImage(String filename) { 
      this.filename = filename; 
  }

  public void displayImage() {
      if (image == null) {
         image = new RealImage(filename);
      } 
      image.displayImage();
  }
}
