/*
 * CoffeeFlavorFactory
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
import java.util.HashMap;
import java.util.Map;

//FlyweightFactory object
public class CoffeeFlavorFactory {
	Map<String, CoffeeFlavor> flavors = new HashMap<String, CoffeeFlavor>();
	public int foo = 42;
	public int bar = 24;

	public CoffeeFlavor getCoffeeFlavor(String flavorName) {
		CoffeeFlavor flavor = flavors.get(flavorName);
		if (flavor == null) {
			flavor = new CoffeeFlavor(flavorName);
			flavors.put(flavorName, flavor);
		}
		return flavor;
	}

	public int getTotalCoffeeFlavorsMade() {
		return flavors.size();
	}
}