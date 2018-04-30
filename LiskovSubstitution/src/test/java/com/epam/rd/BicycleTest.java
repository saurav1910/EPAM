package com.epam.rd;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.epam.rd.noengine.Bicycle;
import com.epam.rd.noengine.VehicleWithoutEngine;

import junit.framework.TestCase;

public class BicycleTest extends TestCase {
	VehicleWithoutEngine vehicle1;
	VehicleWithoutEngine vehicle2;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		vehicle1=new Bicycle("Porsche", 312.0);
		vehicle2=new Bicycle();	
		}
	public void testGetName()
	{
		assertEquals("Porsche", vehicle1.getName());
	}
	public void testGetSpeed()
	{
		assertEquals(312.0, vehicle1.getSpeed());
	}
	public void testSetName()
	{
		vehicle2.setName("BMW");
		assertEquals("BMW", vehicle2.getName());
	}
	public void testSetSpeed()
	{
		vehicle2.setSpeed(313.0);
		assertEquals(313.0, vehicle2.getSpeed());
	}
	public void testEngine()
	{
		ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		vehicle1.startMoving();
		
		String expected="started moving";
		
		assertEquals(expected, outputStream.toString());
	}
}
