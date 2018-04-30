package com.epam.rd;

import com.epam.rd.implementation.Drone;

import junit.framework.TestCase;

public class DroneTest extends TestCase {
	Drone drone;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		drone = new Drone();
	}

	public void testFocus() {
		assertEquals("focused on target",drone.focus());
	}
	public void testStart()
	{
		assertEquals("Drone started", drone.start());
	}
	public void testAccelerate()
	{
		assertEquals("Drone speed increased", drone.accelerate());
	}
	public void testStop()
	{
		assertEquals("Drone stopped", drone.stop());
	}

}
