/*
 * TestFlyweight
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
class TestFlyweight {
	static CoffeeFlavor[] flavors = new CoffeeFlavor[100]; // the flavors
															// ordered
	static CoffeeOrderContext[] tables = new CoffeeOrderContext[100]; // the
																		// tables
																		// for
																		// the
																		// orders
	static int ordersMade = 0;
	static CoffeeFlavorFactory flavorFactory;

	static void takeOrders(String flavorIn, int table) {
		flavors[ordersMade] = flavorFactory.getCoffeeFlavor(flavorIn);
		tables[ordersMade++] = new CoffeeOrderContext(table);
	}

	public static void main(String[] args) {
		flavorFactory = new CoffeeFlavorFactory();

		takeOrders("Cappuccino", 2);
		takeOrders("Cappuccino", 2);
		takeOrders("Frappe", 1);
		takeOrders("Frappe", 1);
		takeOrders("Xpresso", 1);
		takeOrders("Frappe", 897);
		takeOrders("Cappuccino", 97);
		takeOrders("Cappuccino", 97);
		takeOrders("Frappe", 3);
		takeOrders("Xpresso", 3);
		takeOrders("Cappuccino", 3);
		takeOrders("Xpresso", 96);
		takeOrders("Frappe", 552);
		takeOrders("Cappuccino", 121);
		takeOrders("Xpresso", 121);

		for (int i = 0; i < ordersMade; ++i) {
			flavors[i].serveCoffee(tables[i]);
		}
		System.out.println(" ");
		System.out.println("total CoffeeFlavor objects made: "
				+ flavorFactory.getTotalCoffeeFlavorsMade());
	}
}
