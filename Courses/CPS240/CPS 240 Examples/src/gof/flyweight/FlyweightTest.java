/*
 * FlyweightTest
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 25, 2011
 * 
 */
package gof.flyweight;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.core.Is.*;

/**
 * @author albee
 *
 * @version $Id$
 */
public class FlyweightTest {
	CoffeeFlavorFactory cff;
	@Rule
	public ErrorCollector collector= new ErrorCollector();

	/**
	 * Setup test environment
	 */
	@Before
	public void initialize(){
		cff = new CoffeeFlavorFactory();
	}
	/**
	 * Test method for {@link gof.flyweight.CoffeeFlavorFactory#getCoffeeFlavor(java.lang.String)}.
	 */
	@Test
	public void testGetCoffeeFlavor() {
		CoffeeFlavor espresso = cff.getCoffeeFlavor("Espresso");
		CoffeeFlavor swill = cff.getCoffeeFlavor("Decaf");
		CoffeeFlavor espresso2 = cff.getCoffeeFlavor("Espresso");
		assertSame("Got different object when expecting same",
				espresso, espresso2);
		assertNotSame("Claims that espresso is swill", swill, espresso2);
	}

	/**
	 * Test method for {@link gof.flyweight.CoffeeFlavorFactory#getTotalCoffeeFlavorsMade()}.
	 */
	@Test
	public void testGetTotalCoffeeFlavorsMade() {
		assertEquals(0, cff.getTotalCoffeeFlavorsMade());
		cff.getCoffeeFlavor("Espresso");
		assertEquals(1, cff.getTotalCoffeeFlavorsMade());
		cff.getCoffeeFlavor("Espresso");
		assertEquals(1, cff.getTotalCoffeeFlavorsMade());
		cff.getCoffeeFlavor("Lava Java");
		assertEquals(2, cff.getTotalCoffeeFlavorsMade());
		cff.getCoffeeFlavor("Lava Java");
		assertEquals(2, cff.getTotalCoffeeFlavorsMade());
		cff.getCoffeeFlavor("Espresso");
		assertEquals(2, cff.getTotalCoffeeFlavorsMade());
		
	}
	/**
	 * Test method to verify that there are no public fields in  {@link gof.flyweight.CoffeeFlavorFactory}
	 */
	@Test
	public void testNoPublicFields(){
		Class<?> cffClass = null;
		try {
			cffClass = Class.forName("gof.flyweight.CoffeeFlavorFactory");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			fail("Class gof.flyweight.CoffeeFlavorFactory not found");
		}
		
		Field fields[] = cffClass.getFields();
		for (int i = 0; i < fields.length; i++) {
//			String message = fields[i].getName() + " was public";
			collector.checkThat(fields[i].getModifiers() & Modifier.PUBLIC, is(0));
		}
	}
}
