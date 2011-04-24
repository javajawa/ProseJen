package com.harcourtprogramming.markov;

/**
 *
 * @author Benedict
 */
public final class MarkovBuilder
{

	private MarkovBuilder()
	{
		// Nothing to see here. Move along, citizen.
	}
	
	public static void seal(MarkovProcess p)
	{
		p.seal();
	}
	
	public static void addRateTransition(MarkovProcess<?> p, Object from, Object to, float rate)
	{
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
	public static void addWeightTransition(MarkovProcess<?> p, Object from, Object to, float delta)
	{
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
	public static void modifyTransitionWeighting(MarkovProcess<?> p, Object from, Object to, float delta)
	{
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
}
