/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harcourtprogramming.markov;

import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benedict
 */
public class MarkovStateTest
{
	
	public MarkovStateTest()
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
	 * Test of hasTransitionTo method, of class MarkovState.
	 */
	@Test
	public void testHasTransitionTo()
	{
		System.out.println("hasTransitionTo");
		MarkovState next = null;
		MarkovState instance = new MarkovState();
		boolean expResult = false;
		boolean result = instance.hasTransitionTo(next);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getTransitions method, of class MarkovState.
	 */
	@Test
	public void testGetTransitions()
	{
		System.out.println("getTransitions");
		MarkovState instance = new MarkovState();
		Set expResult = null;
		Set result = instance.getTransitions();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
