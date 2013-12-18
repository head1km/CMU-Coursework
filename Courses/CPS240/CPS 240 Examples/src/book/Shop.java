/*
 * Shop
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
 * Base shop for inheritance example.
 * 
 * @author Matt Weisfeld
 *
 * @version $Id$
 */
public abstract class Shop  {

    CustList customerList;

    /**
     * Calculate the sales tax.
     */
    @SuppressWarnings("static-method")
	public void CalculateSaleTax() {
        System.out.println("Calculate Sales Tax");

    };

    /**
     * Return the inventory as an array of String.
     * 
     * @return The inventory.
     */
    public abstract String[] getInventory();

    /**
     * Add item to inventory.
     * @param item Item to add to the inventory.
     */
    public abstract void buyInventory(String item);

}
