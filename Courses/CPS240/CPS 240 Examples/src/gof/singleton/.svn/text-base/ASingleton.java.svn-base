/*
 * ASingleton
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 6, 2011
 * 
 */
package gof.singleton;

/**
 * @author albee
 *
 * @version $Id$
 */
public class ASingleton {
	private static ASingleton _instance = null;
	private int important;
	/**
	 * 
	 */
	protected ASingleton() {
		super();
		important = 0;
		
	}

	synchronized public static ASingleton instance(){
		if (ASingleton._instance == null){
			ASingleton._instance = new ASingleton();
		}
		return ASingleton._instance;
	}
	
	public int getImportant(){
		return important;
	}
}
