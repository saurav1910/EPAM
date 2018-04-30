/**
 * 
 */
package com.epam.rd;

import com.epam.rd.implementation.Car;
import com.epam.rd.implementation.Drone;

import junit.framework.TestCase;

/**
 * @author saurabh
 *
 */
public class CarTest extends TestCase {
	Car car=new Car();
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		car = new Car();
	}

	public void testPlay() {
		assertEquals("playing the music",car.play());
	}
	public void testStart()
	{
		assertEquals("Car started", car.start());
	}
	public void testAccelerate()
	{
		assertEquals("speed increased", car.accelerate());
	}
	public void testStop()
	{
		assertEquals("Car stopped", car.stop());
	}

}
