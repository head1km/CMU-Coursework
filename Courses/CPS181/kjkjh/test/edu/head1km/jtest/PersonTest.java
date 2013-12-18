package edu.head1km.jtest;
//use 4 instead of 3
import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		fail("Not yet implemented");
	}

	public void testGetName() {
		Person p1 = new Person();
		p1.setName("Tom");
		assertEquals("Tom", p1.getName());
	}

	public void testGetMaxAge() {
		fail("Not yet implemented");
	}

}
