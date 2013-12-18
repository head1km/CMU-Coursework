/*
 * TestShop
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Sep 13, 2011
 * 
 */
package book;

/**
 * @author Matt Weisfeld
 *
 * @version $Id$
 */
class TestShop {

	   public static void main (String args[]) {

	      Shop shop = null;

	      String className = "book.PizzaShop";

	      System.out.println("Instantiate the class:" + className + "\n");


	      try {

		   // new pizzaShop();
	       shop = (Shop)Class.forName(className).newInstance();

	      } catch (Exception e) {

	         e.printStackTrace();
	      }

	      String[] inventory = shop.getInventory();


	      // list the inventory

	      for (int i=0; i<inventory.length; i++) {
	         System.out.println("Argument" + i + " = " + inventory[i]);
	      }


	      // buy an item

	      shop.buyInventory(inventory[1]);

	      System.out.println("Instance of Nameable : " + (shop instanceof Nameable));
	   }

	}
