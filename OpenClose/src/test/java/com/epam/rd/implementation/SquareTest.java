/**
 * 
 */
package com.epam.rd.implementation;

import com.epam.rd.exception.NegativeNotAllowedException;
import com.epam.rd.shapes.Shape;
import com.epam.rd.shapes.Square;

import junit.framework.TestCase;

/**
 * @author Saurabh_Verma
 *
 */
public class SquareTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	Square square;
	protected void setUp() throws Exception {
		super.setUp();
		square=new Square(5.0);
	}
	public void testSideSet()
	{
		assertEquals(5.0,square.getSide());
	}
	public void testArea()
	{
		assertEquals(25.0, new AreaCalculator().Area(square));
	}
	public void testSideNotNegative() 
	{
		try {
			square=new Square(-50);
			fail("No exception is raised");
		} catch (NegativeNotAllowedException e) {
			assertTrue(true);
		}
	}
	
}
