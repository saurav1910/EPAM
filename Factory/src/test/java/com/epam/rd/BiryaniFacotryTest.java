package com.epam.rd;

import com.epam.rd.Facotry.BaseBiryaniFactory;
import com.epam.rd.Facotry.BiryaniFactory;

import junit.framework.TestCase;

public class BiryaniFacotryTest extends TestCase {
	BaseBiryaniFactory biryaniFactory;

	protected void setUp() throws Exception {
		super.setUp();
		biryaniFactory=new BiryaniFactory();
	}
	public void testMakeBiryani()
	{
		biryaniFactory.createBiryani("VEG");
		biryaniFactory.createBiryani("egg");
		biryaniFactory.createBiryani("chicken");
	}
	public void testWrongType()
	{
		try {
			biryaniFactory.createBiryani("random");
			assertFalse(true);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
	}

}
