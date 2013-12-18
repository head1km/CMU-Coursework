/*
 * PizzaShop
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
 * Pizza shop demonstrating inheritance and interface implementation.
 * 
 * @author Matt Weisfeld
 *
 * @version $Id$
 */

public class PizzaShop extends Shop implements Nameable {

    String companyName;


    String[] foodOfferings = {
        "Pizza",
        "Spaghetti",
        "Garden Salad",
        "Anitpasto",
        "Calzone"
    };

    public String[] getInventory() {

        return this.foodOfferings;

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
