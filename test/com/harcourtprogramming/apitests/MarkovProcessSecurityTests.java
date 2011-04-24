package com.harcourtprogramming.apitests;

import com.harcourtprogramming.markov.MarkovBuilder;
import com.harcourtprogramming.markov.MarkovProcess;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests whether the internal structure of a {@link MarkovProcess} can be
 * changed using publicly available object references
 *
 * Many of the tests just use the wrapping {@link MarkovBuilder} class to
 * generate the test object, and do not actually extract the Process itself.
 * This is permissible as the interface safety between the two is handled in
 * {@link MarkovProcessSecurityTests}
 * @author Benedict Harcourt &lt;ben.harcourt@harocurtprogramming.co.uk&gt;
 */
public class MarkovProcessSecurityTests
{

	/**
	 * Placeholder public constructor
	 *
	 * {@link MarkovProcessSecurityTests} has no internal state information, and all instances
	 * are isomorphic. This constructor guarantees creation of this test class is
	 * public.
	 */
	public MarkovProcessSecurityTests()
	{
		// Nothing to see here. Move along, citizen.
	}

	/**
	 * Tests whether it is possible to add to a Set of states returned from an
	 * unsealed builder. This operation should not be possible, as the addition
	 * will not add an internal {@link MarkovState} in the dictionary of the
	 * {@link MarkovProcess}
	 */
	@Test
	public void stateSetAddSecurityTest()
	{
		MarkovBuilder<Integer> builder = new MarkovBuilder<Integer>();
		assertNotNull("Could not create MarkovBuilder", builder);

		Set<Integer> states = builder.getStates();
		try
		{
			states.add(0);
		}
		catch (UnsupportedOperationException ex)
		{
			return;
		}
		fail("Able to modify state set through public set.");
	}

	/**
	 * Tests whether it is possible to remove from a Set of states returned from
	 * an unsealed builder. This operation should not be possible, as the addition
	 * will not add an internal {@link MarkovState} in the dictionary of the
	 * {@link MarkovProcess}
	 */
	@Test
	public void stateSetRemoveSecurityTest()
	{
		MarkovBuilder<Integer> builder = new MarkovBuilder<Integer>();
		assertNotNull("Could not create MarkovBuilder", builder);

		try
		{
			builder.addRateTransition(0, 0, 1);
		}
		catch (Throwable ex)
		{
			fail("Unable to add a loopback transition: " + ex.toString());
		}

		Set<Integer> states = builder.getStates();
		try
		{
			states.add(0);
		}
		catch (UnsupportedOperationException ex)
		{
			return;
		}
		fail("Able to modify state set through public set.");
	}
}
