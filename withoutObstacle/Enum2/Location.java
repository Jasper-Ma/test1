package com.lyraedu.sample.Enum2;

public class Location {
	
	int x=0;
	int y=0;
	char face=' ';

	public Location() {
		// TODO Auto-generated constructor stub
	}
	
	public Location(int x, int y, char face) {
		this.x = x;
		this.y = y;
		this.face = face;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getFace() {
		return face;
	}

	public void setFace(char face) {
		this.face = face;
	}
	
	public void printLocation() {
		System.out.println(x+","+y+","+face);
	}

}
