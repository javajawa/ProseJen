package com.harcourtprogramming.markov;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @param <S> 
 * @author Benedict
 */
public final class MarkovProcess<S> implements IMarkovProcess<S>
{
	private BiMap<S, MarkovState> stateDictionary;
	private BiMap<MarkovState, S> stateLookup;

	MarkovProcess()
	{
		stateDictionary = Maps.synchronizedBiMap(HashBiMap.<S, MarkovState>create());
		stateLookup = stateDictionary.inverse();
	}

	/**
	 * TODO: Documentation Here
	 * @return 
	 */
	@Override
	public synchronized MarkovProcess<S> clone()
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * TODO: Documentation Here
	 * @param data
	 * @return 
	 */
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

	@Override
	public boolean transistionExists(S from, S to)
	{
		return stateDictionary.get(from).hasTransitionTo(stateDictionary.get(to));
	}

	@Override
	public Set<S> getStates()
	{
		return stateDictionary.keySet();
	}

	@Override
	public Set<IMarkovTransition<S>> getTransitions(S fromState)
	{
		return translateTransitionSet(stateDictionary.get(fromState).getTransitions());
	}

	@Override
	public Map<S, Float> getProbabilityDensityFunction(S fromState)
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Map<S, Float> getCumulativeDensityFuntion(S fromState)
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not supported yet.");
	}

	void addStates(Iterable<S> states)
	{
		for (S newState : states)
		{
			stateDictionary.put(newState, new MarkovState());
		}
	}

	/**
	 * TODO: Documentation Here
	 * @param from
	 * @param to
	 * @param rate
	 */
	void addRateTransition(S from, S to, float rate)
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	/**
	 * 
	 * @param from
	 * @param to
	 * @param delta
	 */
	void addWeightTransition(S from, S to, float delta)
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	/**
	 * TODO: Documentation Here
	 * @param from
	 * @param to
	 * @param delta
	 */
	void modifyTransitionWeighting(S from, S to, float delta)
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not yet implemented.");
	}

}
