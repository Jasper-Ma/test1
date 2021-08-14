package com.lyraedu.sample.Enum2;

import com.lyraedu.sample.Enum2.StrategyDesign.StrategyEnum;

public class RunCmd {

	public RunCmd() {
		// TODO Auto-generated constructor stub
	}
	
	public Location RunChar(Context context, Location location, String input, Boundry boundry) {
		for (int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			switch (ch) {
			case 'L':
                location = context.executeStrategy(StrategyEnum.TurnLeft,location,boundry);
                break;
            case 'R':
                location = context.executeStrategy(StrategyEnum.TurnRight, location, boundry);
                break;
            case 'M':
                location = context.executeStrategy(StrategyEnum.MoveForward, location, boundry);
                break;
			}
		}
		return location;
	}

}
