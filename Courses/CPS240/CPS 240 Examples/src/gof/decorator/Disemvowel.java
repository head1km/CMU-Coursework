/*
 * Disemvowel
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Sep 29, 2011
 * 
 */
package gof.decorator;

import java.util.Random;

/**
 * Removes the vowels from a PrintableThing.
 * 
 * Disemvoweling is a technique for punishing posters who violate a forum's
 * rules while not breaking threading. Vowels are removed according to the following:
 *  a,e,i,o,u are always removed.
 *  y is removed about 50% of the time.
 *  w is removed about 2% of the time. (Go Welsh!)
 *  
 * @author albee
 *
 * @version $Id$
 */
public class Disemvowel extends ThingDecorator {

	Random random = null;
	/**
	 * Construct a ThingDecorator for disemvoweling.
	 * @param component The PrintableThing to be disemvoweled.
	 */
	public Disemvowel(PrintableThing component) {
		super(component);
		this.random = new Random();
	}

	/**
	 * Generates a disemvoweled string.  
	 * @see gof.decorator.ThingDecorator#print()
	 * 
	 * @return disemvoweled string
	 */
	@Override
	public String print() {
		StringBuffer buffer = new StringBuffer();
		String source = super.print();
		for(int i=0; i < source.length(); i++){
			char curr = source.charAt(i);
		switch(Character.toLowerCase(curr)){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				break;
			case 'y':
				if(this.random.nextFloat() < 0.5){
					buffer.append(curr);
				}
				break;
			case 'w':
				if(this.random.nextFloat() < 0.98){
					buffer.append(curr);
				}
				break;

			default:
				buffer.append(curr);
			}
		}
		return buffer.toString();
	}

}
