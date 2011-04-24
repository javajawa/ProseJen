package com.harcourtprogramming.markov;

/**
 *
 * @author Benedict
 */
public final class ImmutableMarkovTransition<S> implements IMarkovTransition<S>
{
	private float weighting;
	private S destinationState;

	ImmutableMarkovTransition(float weighting, S destinationState)
	{
		this.weighting = weighting;
		this.destinationState = destinationState;
	}

	@Override
	public float getWeighting()
	{
		return weighting;
	}
	
	@Override
	public S getDestinationState()
	{
		return destinationState;
	}
}
