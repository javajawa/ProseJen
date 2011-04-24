package com.harcourtprogramming.markov;

/**
 *
 * @author Benedict
 */
final class MarkovTransition implements IMarkovTransition<MarkovState>
{
	private boolean weighted;
	private float weighting;
	private MarkovState destinationState;

	MarkovTransition(boolean weighted, float weighting, MarkovState destinationState)
	{
		this.weighted = weighted;
		this.weighting = weighting;
		this.destinationState = destinationState;
	}

	MarkovTransition(MarkovState toState)
	{
		this(false, (float)0.0, toState);
	}

	@Override
	public float getWeighting()
	{
		return weighting;
	}

	public boolean isWeight()
	{
		return weighted;
	}
	
	public boolean isRate()
	{
		return !weighted;
	}
	
	public void makeWeight()
	{
		weighted = true;
	}
	
	public void makeRate()
	{
		weighted = false;
	}

	public void setWeight(float weight)
	{
		this.weighting = weight;
	}
	
	public void modifyWeight(float delta)
	{
		this.weighting += delta;
	}

	@Override
	public MarkovState getDestinationState()
	{
		return destinationState;
	}
}
