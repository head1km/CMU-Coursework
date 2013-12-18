/*
 * DonutShop
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
 * Donut shop demonstrating inheritance and interface implementation.
 * @author Matt Weisfeld
 *
 * @version $Id$
 */
public class DonutShop extends Shop implements Nameable {

    String companyName;

    String[] menuItems = {
        "Donuts",
        "Muffins",
        "Danish",
        "Coffee",
        "Tea"
	};

    public String[] getInventory() {

        return this.menuItems;

    }

    public void buyInventory(String item) {

        System.out.println("\nYou have just purchased " + item);

    }

    public String getName(){

        return this.companyName;
    }

    public void setName(String name){

        this.companyName = name;
    }
}

