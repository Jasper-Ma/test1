package com.lyraedu.sample.Enum2;

import com.lyraedu.sample.Enum2.StrategyDesign.StrategyEnum;

public class TurnRight implements StrategyInterface {//IStrategy

	public TurnRight() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Location operate(Location location, Boundry boundry) {
		switch (location.face){
        case 'N':
        	location.setFace('E');
            break;
        case 'E':
        	location.setFace('S');
            break;
        case 'S':
        	location.setFace('W');
            break;
        case 'W':
        	location.setFace('N');
            break;
    }
		return location;
	}
	
	@Override
	public StrategyEnum getStrategy() {
		//这里的StrategyEnum是枚举？
		return StrategyEnum.TurnRight;
	}
	
}
