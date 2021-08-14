package com.lyraedu.sample.Enum2;

import com.lyraedu.sample.Enum2.StrategyDesign.StrategyEnum;

public interface StrategyInterface {
	
	public abstract Location operate(Location location, Boundry boundry);

	public abstract StrategyEnum getStrategy();
}
