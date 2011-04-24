package com.harcourtprogramming.markov;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Benedict
 */
final class MarkovState
{
	private Set<MarkovTransition> transitions;
	
	public boolean hasTransitionTo(MarkovState next)
	{
		for (MarkovTransition trans : transitions)
		{
			return trans.getDestinationState().equals(next);
		}
		return false;
	}

	public Set<IMarkovTransition<MarkovState>> getTransitions()
	{
		return new HashSet<IMarkovTransition<MarkovState>>(transitions);
	}
	
}
