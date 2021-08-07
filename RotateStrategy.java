package com.lyraedu.sample;

import com.lyraedu.sample.FootballEnumDesign.Location;
import com.lyraedu.sample.FootballEnumDesign.Boundry;
import com.lyraedu.sample.FootballEnumDesign.Directions;

public interface RotateStrategy {
	
	public char operate(char a, char b);
	
	public Location movement(String a, String b, int x, int y, int topRightY, int topRightX);
}
