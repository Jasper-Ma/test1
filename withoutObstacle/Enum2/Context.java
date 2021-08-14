package com.lyraedu.sample.Enum2;
import java.util.HashMap;
import java.util.Map;

import com.lyraedu.sample.Enum2.StrategyDesign.StrategyEnum;

public class Context {
	public Map<StrategyEnum, StrategyInterface> strategiesMap = new HashMap<StrategyEnum, StrategyInterface>();
	
	public Context() {
	   	// TODO Auto-generated constructor stub
	}
	
   	public void addStrategy(StrategyInterface strategyInterface) {
   		strategiesMap.put(strategyInterface.getStrategy(), strategyInterface);
   		}
   	
   	public Location executeStrategy(StrategyEnum strategyEnum, Location location, Boundry boundry) {
   		return strategiesMap.get(strategyEnum).operate(location, boundry);
   	}
	

}
