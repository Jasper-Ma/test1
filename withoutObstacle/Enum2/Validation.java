package com.lyraedu.sample.Enum2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public Validation() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isValidUpperRight(String line) {
		line = line.trim();
		String regex = "^(\\d{1,} \\d{1,})$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(line);
		return matcher.matches();
	}

	public static boolean isValidPositionStr(String positionStr) {
		positionStr = positionStr.trim();
		String regex = "^(\\d{1,} \\d{1,} (N|S|E|W))$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(positionStr);
		return matcher.matches();
	}
	
	public static boolean checkBlock(Location currentLocation, Location obstacle) {
		return (currentLocation.getX()==obstacle.getX()&&
				currentLocation.getY()==obstacle.getY());
	}

	
}
