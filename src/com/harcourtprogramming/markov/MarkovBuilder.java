package com.harcourtprogramming.markov;

import java.util.Map;
import java.util.Set;

/**
 *
 * @param <S> 
 * @author Benedict
 */
public final class MarkovBuilder<S> implements IMarkovProcess<S>
{
	private MarkovProcess<S> proc;
	private boolean sealed;
	private boolean statesSealed;

	/**
	 * TODO: Documentation Here
	 */
	public MarkovBuilder()
	{
		sealed = false;
		proc = new MarkovProcess<S>();
	}

	/**
	 * TODO: Documentation Here
	 */
	public void seal()
	{
		sealed = true;
	}

	/**
	 * TODO: Documentation Here
	 * @return
	 */
	public MarkovProcess<S> getProcess()
	{
		if (this.sealed) return proc;
		return proc.clone();
	}

	/**
	 * TODO: Documentation Here
	 * @param states
	 */
	public void addStates(Iterable<S> states)
	{
		proc.addStates(states);
	}

	/**
	 * TODO: Documentation Here
	 */
	public void sealStates()
	{
		statesSealed = true;
	}

	/**
	 * TODO: Documentation Here
	 * @param from
	 * @param to
	 * @param rate
	 */
	public void addRateTransition(S from, S to, float rate)
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
	public void addWeightTransition(S from, S to, float delta)
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
	public void modifyTransitionWeighting(S from, S to, float delta)
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	@Override
	public boolean transistionExists(S from, S to)
	{
		// TODO: Write this function
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Set<S> getStates()
	{
		return proc.getStates();
	}

	@Override
	public Set<IMarkovTransition<S>> getTransitions(S fromState)
	{
		return proc.getTransitions(fromState);
	}

	@Override
	public Map<S, Float> getProbabilityDensityFunction(S fromState)
	{
		return proc.getProbabilityDensityFunction(fromState);
	}

	@Override
	public Map<S, Float> getCumulativeDensityFuntion(S fromState)
	{
		return proc.getCumulativeDensityFuntion(fromState);
	}

}
