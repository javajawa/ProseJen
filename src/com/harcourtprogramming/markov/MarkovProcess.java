package com.harcourtprogramming.markov;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Benedict
 */
public final class MarkovProcess<S>
{
	private BiMap<S, MarkovState> stateDictionary;
	private BiMap<MarkovState, S> stateLookup;
	private boolean sealed;

	public MarkovProcess()
	{
		sealed = false;
		stateDictionary =  HashBiMap.create();
		stateLookup = stateDictionary.inverse();
	}
	
	private Set<IMarkovTransition<S>> translateTransitionSet(Set<IMarkovTransition<MarkovState>> data)
	{
		Set<IMarkovTransition<S>> out = new HashSet<IMarkovTransition<S>>(data.size(), 1);
		
		for (IMarkovTransition<MarkovState> trans : data)
		{
			out.add(
					new ImmutableMarkovTransition<S>(
							trans.getWeighting(), 
							stateLookup.get(trans.getDestinationState())
					)
			);
		}
		
		return Collections.unmodifiableSet(out);
	}
	
	public boolean transistionExists(S from, S to)
	{
		return stateDictionary.get(from).hasTransitionTo(stateDictionary.get(to));
	}

	public Set<S> getStates()
	{
		return stateDictionary.keySet();
	}

	public Set<IMarkovTransition<S>> getTransitions(S fromState)
	{
		return translateTransitionSet(stateDictionary.get(fromState).getTransitions());
	}

	public Map<S, Float> getProbabilityDensityFunction(S fromState)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Map<S, Float> getCumulativeDensityFuntion(S fromState)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	synchronized void seal()
	{
		sealed = true;
	}
	
}
