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

	/**
	 * TODO: Documentation Here
	 * @param weighted
	 * @param weighting
	 * @param destinationState 
	 */
	MarkovTransition(boolean weighted, float weighting, MarkovState destinationState)
	{
		this.weighted = weighted;
		this.weighting = weighting;
		this.destinationState = destinationState;
	}

	/**
	 * TODO: Documentation Here
	 * @param toState 
	 */
	MarkovTransition(MarkovState toState)
	{
		this(false, (float)0.0, toState);
	}

	@Override
	public float getWeighting()
	{
		return weighting;
	}

	/**
	 * TODO: Documentation Here
	 * @return 
	 */
	public boolean isWeight()
	{
		return weighted;
	}
	
	/**
	 * TODO: Documentation Here
	 * @return 
	 */
	public boolean isRate()
	{
		return !weighted;
	}
	
	/**
	 * TODO: Documentation Here
	 */
	public void makeWeight()
	{
		weighted = true;
	}
	
	/**
	 * TODO: Documentation Here
	 */
	public void makeRate()
	{
		weighted = false;
	}

	/**
	 * TODO: Documentation Here
	 * @param weight 
	 */
	public void setWeighting(float weight)
	{
		this.weighting = weight;
	}
	
	/**
	 * TODO: Documentation Here
	 * @param delta 
	 */
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
