package com.harcourtprogramming.markov;

import java.util.Map;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Runs generic unrelated tests on the functions of the {@link MarkovBuilder}
 * class
 * @author Benedict Harcourt &lt;ben.harcourt@harocurtprogramming.co.uk&gt;
 */
public class MarkovBuilderTest
{

	/**
	 * Placeholder public constructor 
	 *
	 * {@link MarkovBuilderTest has no internal state information, and all 
	 * instances are isomorphic. This constructor guarantees creation of this 
	 * test class is public.
	 */
	public MarkovBuilderTest()
	{
		// Nothing to see here. Move along, citizen!
	}

	/**
	 * Tests that {@link MarkovBuilder#getProcess() getProcess} of a just
	 * initialised {@link MarkovBuilder} returns a non-null
	 * {@link MarkovProcess}
	 *
	 * @see MarkovBuilder#getProcess()
	 */
	@Test
	public void testGetProcess()
	{
		MarkovBuilder instance = new MarkovBuilder();
		MarkovProcess result = instance.getProcess();
		assertNotNull(result);
	}

	/**
	 * Test of addStates method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testAddStates()
	{
		System.out.println("addStates");
		Iterable states = null;
		MarkovBuilder instance = new MarkovBuilder();
		instance.addStates(states);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of sealStates method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testSealStates()
	{
		System.out.println("sealStates");
		MarkovBuilder instance = new MarkovBuilder();
		instance.sealStates();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addRateTransition method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testAddRateTransition()
	{
		System.out.println("addRateTransition");
		Object from = null;
		Object to = null;
		float rate = 0.0F;
		MarkovBuilder instance = new MarkovBuilder();
		instance.addRateTransition(from, to, rate);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addWeightTransition method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testAddWeightTransition()
	{
		System.out.println("addWeightTransition");
		Object from = null;
		Object to = null;
		float delta = 0.0F;
		MarkovBuilder instance = new MarkovBuilder();
		instance.addWeightTransition(from, to, delta);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of modifyTransitionWeighting method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testModifyTransitionWeighting()
	{
		System.out.println("modifyTransitionWeighting");
		Object from = null;
		Object to = null;
		float delta = 0.0F;
		MarkovBuilder instance = new MarkovBuilder();
		instance.modifyTransitionWeighting(from, to, delta);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of transistionExists method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testTransistionExists()
	{
		System.out.println("transistionExists");
		Object from = null;
		Object to = null;
		MarkovBuilder instance = new MarkovBuilder();
		boolean expResult = false;
		boolean result = instance.transistionExists(from, to);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getStates method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testGetStates()
	{
		System.out.println("getStates");
		MarkovBuilder instance = new MarkovBuilder();
		Set expResult = null;
		Set result = instance.getStates();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getTransitions method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testGetTransitions()
	{
		System.out.println("getTransitions");
		Object fromState = null;
		MarkovBuilder instance = new MarkovBuilder();
		Set expResult = null;
		Set result = instance.getTransitions(fromState);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getProbabilityDensityFunction method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testGetProbabilityDensityFunction()
	{
		System.out.println("getProbabilityDensityFunction");
		Object fromState = null;
		MarkovBuilder instance = new MarkovBuilder();
		Map expResult = null;
		Map result = instance.getProbabilityDensityFunction(fromState);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getCumulativeDensityFuntion method, of class MarkovBuilder.
	 * TODO: Review this test
	 */
	@Test
	public void testGetCumulativeDensityFuntion()
	{
		System.out.println("getCumulativeDensityFuntion");
		Object fromState = null;
		MarkovBuilder instance = new MarkovBuilder();
		Map expResult = null;
		Map result = instance.getCumulativeDensityFuntion(fromState);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
