package com.lyraedu.sample.Enum2;

public class RecordLocation {
	
	private Location location;

	public RecordLocation() {
		// TODO Auto-generated constructor stub
	}

	public RecordLocation(Location location) {
		this.location = location;
	}
	
	public void PrintLocation() {
		System.out.println("Current location is: " + location.getX() 
		+ " " + location.getY() + " " + location.getFace());
	}
	
}
