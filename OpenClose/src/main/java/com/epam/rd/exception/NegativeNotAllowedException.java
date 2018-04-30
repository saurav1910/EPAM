/**
 * 
 */
package com.epam.rd.exception;

/**
 * @author Saurabh_Verma
 *
 */
public class NegativeNotAllowedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9115970506942715934L;
	public NegativeNotAllowedException() {
		super("Negative Value Is not allowed");
	}

}
