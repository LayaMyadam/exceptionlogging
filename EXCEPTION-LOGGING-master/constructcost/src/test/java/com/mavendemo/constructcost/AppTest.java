package com.mavendemo.constructcost;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase
{
	 final static Logger logger = Logger.getLogger("AppTest.java");
	public void test() {
		logger.info("material,area and automation should not be zero or null");
		Construct cc =new Construct();

		double answer =cc.costForMaterial("Standard",500,false);

		assertEquals(600000,answer,0.001);
	}

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
