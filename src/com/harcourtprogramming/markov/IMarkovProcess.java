package com.harcourtprogramming.markov;

import java.util.Map;
import java.util.Set;

/**
 * TODO: Documentation Here
 * @param <S> 
 * @author Benedict
 */
public interface IMarkovProcess<S>
{
	
	/**
	 * TODO: Documentation Here
	 * @param from
	 * @param to
	 * @return
	 */
	public boolean transistionExists(S from, S to);

	/**
	 * TODO: Documentation Here
	 * @return
	 */
	public Set<S> getStates();

	/**
	 * TODO: Documentation Here
	 * @param fromState
	 * @return
	 */
	public Set<IMarkovTransition<S>> getTransitions(S fromState);

	/**
	 * TODO: Documentation Here
	 * @param fromState
	 * @return
	 */
	public Map<S, Float> getProbabilityDensityFunction(S fromState);

	/**
	 * TODO: Documentation Here
	 * @param fromState
	 * @return
	 */
	public Map<S, Float> getCumulativeDensityFuntion(S fromState);
	
}
