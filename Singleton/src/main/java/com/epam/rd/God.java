/**
 * 
 */
package com.epam.rd;

/**
 * @author saura
 *
 */
public class God {
	static God god;

	private God() {

	}

	public static God getInstance() {
		//Synchronized for thread safety in a multiple threads environment using class level locks.
		synchronized (God.class) {
			if (god == null) {
				System.out.println("first Instance created");
				god = new God();
			}
			return god;
		}
	}

}
