package com.lyraedu.sample.Enum2;

import com.lyraedu.sample.Enum2.StrategyDesign.StrategyEnum;

public class MoveForward implements StrategyInterface {

	public MoveForward() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Location operate(Location location, Boundry boundry) {
		switch (location.face){
        case 'N':
        	if (location.y+1<=boundry.topRightY)
        		location.y = location.y+1;
        	else System.out.println("out of boundry");
            break;
        case 'S':
        	if (location.y-1>=0)
        		location.y = location.y-1;
            break;
        case 'E':
        	if (location.x+1<=boundry.topRightX)
        		location.x = location.x+1;
            break;
        case 'W':
        	if (location.x-1>=0)
        		location.x = location.x-1;
            break;
    }
		return location;
	}

	@Override
	public StrategyEnum getStrategy() {
		// TODO Auto-generated method stub
		return StrategyEnum.MoveForward;
	}

}
