/**
 * 
 */
package com.epam.rd.implementation;

import com.epam.rd.exception.NegativeNotAllowedException;
import com.epam.rd.shapes.Square;
import com.epam.rd.shapes.Triangle;

import junit.framework.TestCase;

/**
 * @author Saurabh_Verma
 *
 */
public class TriangleTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	Triangle triangle;
	protected void setUp() throws Exception {
		super.setUp();
		triangle=new Triangle(5.0,4.0);
	}
	public void testSideSet()
	{
		assertEquals(5.0,triangle.getLength());
		assertEquals(4.0, triangle.getHeight());
	}
	public void testArea()
	{
		assertEquals(10.0, new AreaCalculator().Area(triangle));
	}
	public void testSideNotNegative() 
	{
		try {
			triangle=new Triangle(-5.0,-5.9);
			fail("No exception is raised");
		} catch (NegativeNotAllowedException e) {
			assertTrue(true);
		}
	}
	

}
