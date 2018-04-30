package com.epam.rd;

import junit.framework.TestCase;

public class GodTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testGod()
	{
		God god1=God.getInstance();
		God god2=God.getInstance();
		assertEquals(god1.hashCode(), god2.hashCode());
	}

}
