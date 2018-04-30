package com.epam.rd;

import com.epam.rd.highlevel.ElectricSwitch;
import com.epam.rd.highlevel.Switchable;
import com.epam.rd.lowlevel.Bulb;
import com.epam.rd.lowlevel.Fan;

import junit.framework.TestCase;

public class ElectricPowerTest extends TestCase {
	Switchable switchable;
	ElectricSwitch electricswitch;
	@Override
	protected void setUp() throws Exception {
		
		super.setUp();
	}
	public void testPressBulb()
	{
		switchable=new Bulb();
		electricswitch=new ElectricSwitch(switchable);
		electricswitch.press();
		electricswitch.press();
	}
	public void testPressFan()
	{
		switchable=new Fan();
		electricswitch=new ElectricSwitch(switchable);
		electricswitch.press();
		electricswitch.press();
	}
}
