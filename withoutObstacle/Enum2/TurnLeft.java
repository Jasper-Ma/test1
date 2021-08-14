package com.lyraedu.sample.Enum2;

import com.lyraedu.sample.Enum2.StrategyDesign.StrategyEnum;

public class TurnLeft implements StrategyInterface{

	public TurnLeft() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Location operate(Location location, Boundry boundry) {
		switch (location.face){
        case 'N':
        	location.setFace('W');
            break;
        case 'E':
        	location.setFace('N');
            break;
        case 'S':
        	location.setFace('E');
            break;
        case 'W':
        	location.setFace('S');
            break;
    }
		 return location;
	}

	@Override
	public StrategyEnum getStrategy() {
		// TODO Auto-generated method stub
		return StrategyEnum.TurnLeft;
	}

}
