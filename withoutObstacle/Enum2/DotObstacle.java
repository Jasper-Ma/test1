package com.lyraedu.sample.Enum2;

public class DotObstacle implements Obstacle{
	
	private Location location;
	
	@Override
	public Location getObstacle() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public void setObstacle(Location location) {
		this.location=location;
	}


	

}
