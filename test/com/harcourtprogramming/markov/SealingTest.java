package com.harcourtprogramming.markov;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test to check that the sealing functions of {@link MarkovBuilder} correctly
 * seal the underlying {@link MarkovProcess} so that it can not be edited
 *
 * @see MarkovBuilder
 * @see MarkovProcess
 * @see SecurityTests
 * @author Benedict Harcourt &lt;ben.harcourt@harocurtprogramming.co.uk&gt;
 */
public class SealingTest
{
	
	/**
	 * Placeholder public constructor 
	 *
	 * {@link SealingTest} has no internal state information, and all instances
	 * are isomorphic. This constructor guarantees creation of this test class is
	 * public.
	 */
	public SealingTest()
	{
		// Nothing to see here. Move along, citizen!
	}

	/**
	 * Check that, after calling {@link MarkovBuilder#sealStates()}, you can not
	 * implicitly add states to the {@link MarkovProcess} using {@link
	 * MarkovBuilder#addRateTransition(java.lang.Object, java.lang.Object, float)
	 * MarkovBuilder.addRateTransition}
	 *
	 * @see #stateSealingUsingWeightedTransition()
	 * @see #stateSealingUsingAddStates()
	 */
	@Test
	public void stateSealingUsingRateTransition()
	{
		MarkovBuilder<Integer> builder = new MarkovBuilder<Integer>();
		assertNotNull("Unable to create MarkovBuilder", builder);

		List<Integer> testStates = new ArrayList<Integer>(3);
		testStates.add(0);
		testStates.add(1);
		testStates.add(0);
		assert(testStates.size() == 3);

		builder.addStates(testStates);
		assertEquals("Adding states permitted non-unique states", 2, builder.getStates().size());

		try
		{
			builder.sealStates();
		}
		catch (Throwable ex)
		{
			fail("Exception occurred whilst attempting to sealStates: " + ex.toString());
		}

		try
		{
			builder.addRateTransition(0, 2, (float)0.5);
		}
		catch (UnsupportedOperationException ex)
		{
			return;
		}
		catch (Throwable ex)
		{
			fail("Non-UnsupportedOperationException occurred when added state to sealed process: " + ex.toString());
		}
		fail("No exceptions occurred when adding a state to a state-sealed process.");
	}

	/**
	 * Check that, after calling {@link MarkovBuilder#sealStates()}, you can not
	 * implicitly add states to the {@link MarkovProcess} using {@link 
	 * MarkovBuilder#addWeightTransition(java.lang.Object, java.lang.Object, float)
	 * MarkovBuilder.addWeightTransition}
	 *
	 * @see #stateSealingUsingRateTransition() 
	 * @see #stateSealingUsingAddStates()
	 */
	@Test
	public void stateSealingUsingWeightedTransition()
	{
		MarkovBuilder<Integer> builder = new MarkovBuilder<Integer>();
		assertNotNull("Unable to create MarkovBuilder", builder);

		List<Integer> testStates = new ArrayList<Integer>(3);
		testStates.add(0);
		testStates.add(1);
		testStates.add(0);
		assert(testStates.size() == 3);

		builder.addStates(testStates);
		assertEquals("Adding states permitted non-unique states", 2, builder.getStates().size());

		try
		{
			builder.sealStates();
		}
		catch (Throwable ex)
		{
			fail("Exception occurred whilst attempting to sealStates: " + ex.toString());
		}

		try
		{
			builder.addWeightTransition(0, 2, (float)0.5);
		}
		catch (UnsupportedOperationException ex)
		{
			return;
		}
		catch (Throwable ex)
		{
			fail("Non-UnsupportedOperationException occurred when added state to sealed process: " + ex.toString());
		}
		fail("No exceptions occurred when adding a state to a state-sealed process.");
	}
	
	/**
	 * Check that, after calling {@link MarkovBuilder#sealStates()}, you can not
	 * explicitly add states to the {@link MarkovProcess} using {@link 
	 * MarkovBuilder#addStates(java.lang.Iterable) MarkovBuilder.addStates}
	 *
	 * @see #checkStateSealingUsingWeightedTransition() 
	 * @see #checkStateSealingUsingRateTransition()
	 */
	@Test
	public void checkStateSealingUsingAddStates()
	{
		MarkovBuilder<Integer> builder = new MarkovBuilder<Integer>();
		assertNotNull("Unable to create MarkovBuilder", builder);

		List<Integer> testStates = new ArrayList<Integer>(3);
		testStates.add(0);
		testStates.add(1);
		testStates.add(0);
		assert(testStates.size() == 3);

		builder.addStates(testStates);
		assertEquals("Adding states permitted non-unique states", 2, builder.getStates().size());

		try
		{
			builder.sealStates();
		}
		catch (Throwable ex)
		{
			fail("Exception occurred whilst attempting to sealStates: " + ex.toString());
		}

		testStates.clear();
		testStates.add(0);
		testStates.add(1);
		testStates.add(2);

		try
		{
			builder.addStates(testStates);
		}
		catch (UnsupportedOperationException ex)
		{
			return;
		}
		catch (Throwable ex)
		{
			fail("Non-UnsupportedOperationException occurred when added state to sealed process: " + ex.toString());
		}
		fail("No exceptions occurred when adding a state to a state-sealed process.");
	}

}
