package com.harcourtprogramming.markov;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benedict
 */
public class ImmutableMarkovTransitionTest
{

	/**
	 * Tests that a Transition can not be created without a destination state.
	 */
	@Test
	public void ContrcutorTestWithNull()
	{
		try
		{
			ImmutableMarkovTransition<String> inst = new ImmutableMarkovTransition<String>(1, null);
		}
		catch (IllegalArgumentException ex)
		{
			return;
		}
		fail("Illegal Argument Exception was not thrown");
	}

	/**
	 * Tests that a Transition can not be created with a non-positive weighting
	 */
	@Test
	public void ContrcutorTestWithZero()
	{
		try
		{
			ImmutableMarkovTransition<String> inst = new ImmutableMarkovTransition<String>(0.0F, "test");
		}
		catch (IllegalArgumentException ex)
		{
			return;
		}
		fail("Illegal Argument Exception was not thrown");
	}
	
	/**
	 * Tests that a Transition can not be created with a non-positive weighting
	 */
	@Test
	public void ContrcutorTestWithNegative()
	{
		try
		{
			ImmutableMarkovTransition<String> inst = new ImmutableMarkovTransition<String>(-1.0F, "test");
		}
		catch (IllegalArgumentException ex)
		{
			return;
		}
		fail("Illegal Argument Exception was not thrown");
	}

	@Test
	public void testGetWeighting()
	{
		float expResult = 1.0F;
		ImmutableMarkovTransition<String> instance = 
						new ImmutableMarkovTransition<String>(expResult, "");
		float result = instance.getWeighting();

		assertEquals(expResult, result, 0.001);
	}

	@Test
	public void testGetDestinationState()
	{
		String expResult = "Hello";
		ImmutableMarkovTransition<String> instance = 
						new ImmutableMarkovTransition<String>(1.0F, expResult);
		Object result = instance.getDestinationState();

		assertEquals(expResult, result);
	}
	
	@Test
	public void testOverwritingWeighting()
	{
		Float insertValue = 2.0F;
		ImmutableMarkovTransition<String> s = new ImmutableMarkovTransition<String>(
						insertValue, "test");
		
		float expResult = 2.0F;
		insertValue = 3.0F;
		
		assertEquals(expResult, s.getWeighting(), 0.05);
	}

}
