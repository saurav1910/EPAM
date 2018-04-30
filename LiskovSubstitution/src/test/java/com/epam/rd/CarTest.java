package com.epam.rd;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.epam.rd.engine.Car;
import com.epam.rd.engine.VehicleWithEngine;

import junit.framework.TestCase;

public class CarTest extends TestCase {
	VehicleWithEngine vehicle1;
	VehicleWithEngine vehicle2;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		vehicle1=new Car("Porsche", 312.0);
		vehicle2=new Car();
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
		vehicle1.startEngine();
		
		String expected="Engine is started";
		
		assertEquals(expected, outputStream.toString());
	}
}
