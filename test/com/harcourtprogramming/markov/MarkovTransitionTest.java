/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harcourtprogramming.markov;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benedict
 */
public class MarkovTransitionTest
{
	
	public MarkovTransitionTest()
	{
	}

	@BeforeClass
	public static void setUpClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownClass() throws Exception
	{
	}

	/**
	 * Test of getWeighting method, of class MarkovTransition.
	 */
	@Test
	public void testGetWeighting()
	{
		System.out.println("getWeighting");
		MarkovTransition instance = null;
		float expResult = 0.0F;
		float result = instance.getWeighting();
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isWeight method, of class MarkovTransition.
	 */
	@Test
	public void testIsWeight()
	{
		System.out.println("isWeight");
		MarkovTransition instance = null;
		boolean expResult = false;
		boolean result = instance.isWeight();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isRate method, of class MarkovTransition.
	 */
	@Test
	public void testIsRate()
	{
		System.out.println("isRate");
		MarkovTransition instance = null;
		boolean expResult = false;
		boolean result = instance.isRate();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of makeWeight method, of class MarkovTransition.
	 */
	@Test
	public void testMakeWeight()
	{
		System.out.println("makeWeight");
		MarkovTransition instance = null;
		instance.makeWeight();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of makeRate method, of class MarkovTransition.
	 */
	@Test
	public void testMakeRate()
	{
		System.out.println("makeRate");
		MarkovTransition instance = null;
		instance.makeRate();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setWeighting method, of class MarkovTransition.
	 */
	@Test
	public void testSetWeighting()
	{
		System.out.println("setWeighting");
		float weight = 0.0F;
		MarkovTransition instance = null;
		instance.setWeighting(weight);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of modifyWeight method, of class MarkovTransition.
	 */
	@Test
	public void testModifyWeight()
	{
		System.out.println("modifyWeight");
		float delta = 0.0F;
		MarkovTransition instance = null;
		instance.modifyWeight(delta);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getDestinationState method, of class MarkovTransition.
	 */
	@Test
	public void testGetDestinationState()
	{
		System.out.println("getDestinationState");
		MarkovTransition instance = null;
		MarkovState expResult = null;
		MarkovState result = instance.getDestinationState();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
