package com.harcourtprogramming.markov;

/**
 * TODO: Documentation Here
 * @param <S> 
 * @author Benedict
 */
public interface IMarkovTransition<S>
{
	/**
	 * TODO: Documentation Here
	 * @return
	 */
	public S getDestinationState();
	/**
	 * TODO: Documentation Here
	 * @return
	 */
	public float getWeighting();
}
