/*
 * StripPunctuation
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Sep 29, 2011
 * 
 */
package gof.decorator;


/**
 * Removes the punctuation from a PrintableThing.
 *  
 * @author albee
 *
 * @version $Id$
 */
public class StripPunctuation extends ThingDecorator {

	/**
	 * Construct a ThingDecorator for punctuation stripping.
	 * @param component The PrintableThing to be stripped.
	 */
	public StripPunctuation(PrintableThing component) {
		super(component);
	}

	/**
	 * Generates a string with no puctuation.  
	 * @see gof.decorator.ThingDecorator#print()
	 * 
	 * @return unpunctuated string
	 */
	@Override
	public String print() {
		StringBuffer buffer = new StringBuffer();
		String source = super.print();
		for(int i=0; i < source.length(); i++){
			char ch = source.charAt(i);
			if(Character.isWhitespace(ch) ||
					Character.isLetter(ch) ||
					Character.isDigit(ch)){
				buffer.append(ch);
			}
		}
		return buffer.toString();
	}

}
