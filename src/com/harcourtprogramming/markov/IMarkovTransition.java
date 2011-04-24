package com.harcourtprogramming.markov;

/**
 *
 * @author Benedict
 */
public interface IMarkovTransition<S>
{
	public S getDestinationState();
	public float getWeighting();
}
