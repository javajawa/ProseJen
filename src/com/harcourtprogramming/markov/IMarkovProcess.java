/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harcourtprogramming.markov;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Benedict
 */
public interface IMarkovProcess<S>
{
	
	public boolean transistionExists(S from, S to);

	public Set<S> getStates();

	public Set<IMarkovTransition<S>> getTransitions(S fromState);

	public Map<S, Float> getProbabilityDensityFunction(S fromState);

	public Map<S, Float> getCumulativeDensityFuntion(S fromState);
	
}
