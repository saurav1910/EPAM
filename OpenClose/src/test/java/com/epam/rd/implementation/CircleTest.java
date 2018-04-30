/**
 * 
 */
package com.epam.rd.implementation;


import com.epam.rd.exception.NegativeNotAllowedException;
import com.epam.rd.shapes.Circle;
import com.epam.rd.shapes.Shape;
import com.epam.rd.shapes.Square;

import junit.framework.TestCase;

/**
 * @author Saurabh_Verma
 *
 */
public class CircleTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	Circle circle;
	protected void setUp() throws Exception {
		super.setUp();
		circle=new Circle(5.0);
	}
	public void testRadiusSet()
	{
		assertEquals(5.0,circle.getRadius());
	}
	public void testArea()
	{
		assertEquals(78.53981633974483, new AreaCalculator().Area(circle));
	}
	public void testSideNotNegative() 
	{
		try {
			circle=new Circle(-5);
			fail("No exception is raised");
		} catch (NegativeNotAllowedException e) {
			assertTrue(true);
		}
	}
}
