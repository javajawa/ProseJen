package com.harcourtprogramming.markov;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the constructors, getters, and the lack of setters for the
 * {@link ImmutableMarkovTransition}
 * @author Benedict Harcourt &lt;ben.harcourt@harocurtprogramming.co.uk&gt;
 */
public class ImmutableMarkovTransitionTest
{

	/**
	 * Tests that a Transition can not be created without a destination state.
	 */
	@Test
	public void ConstructorTestWithNull()
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
	public void ConstructorTestWithZero()
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
	public void ConstructorTestWithNegative()
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

	/**
	 * Test that the weighting returned by
	 * {@link ImmutableMarkovTransition#getWeighting() getWeighting} is the same
	 * as the weighting set in the constructor.
	 */
	@Test
	public void testGetWeighting()
	{
		float expResult = 1.0F;
		ImmutableMarkovTransition<String> instance = 
						new ImmutableMarkovTransition<String>(expResult, "");
		float result = instance.getWeighting();

		assertEquals(expResult, result, 0.001);
	}

	/**
	 * Tests that the retrieved destination state is the same as the inserted one.
	 */
	@Test
	public void testGetDestinationState()
	{
		String expResult = "Hello";
		ImmutableMarkovTransition<String> instance = 
						new ImmutableMarkovTransition<String>(1.0F, expResult);
		Object result = instance.getDestinationState();

		assertEquals(expResult, result);
	}

	/**
	 * Test that the weighting of the an {@link ImmutableMarkovTransition} can
	 * not be changed after it is creating.
	 */
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

	/**
	 * Tests that the state in an {@link ImmutableMarkovTransition} can not be
	 * overwritten with a new reference, thus changing the destination State
	 */
	@Test
	public void testOverwritingState()
	{
		String insertValue  = "State 1";
		String expectedValue = new String(insertValue);
		String replaceValue = "State 2";

		ImmutableMarkovTransition<String> s = new ImmutableMarkovTransition<String>(10.0F, insertValue);
		insertValue = replaceValue;

		assertEquals("Able to update destination state", expectedValue, s.getDestinationState());
	}

}
