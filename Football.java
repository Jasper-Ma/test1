package com.lyraedu.sample;

import java.util.Scanner;

public class Football {
	
	int topRightX = 0;
	int topRightY = 0;
	int x = 0;
	int y = 0;
	char face = ' ';

	public Football() {
		// TODO Auto-generated constructor stub
		
	}

	public int getTopRightX() {
		return topRightX;
	}

	public void setTopRightX(int topRightX) {
		this.topRightX = topRightX;
	}

	public int getTopRightY() {
		return topRightY;
	}

	public void setTopRightY(int topRightY) {
		this.topRightY = topRightY;
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
	
	public void setCorner() {
    	System.out.println("Please type the upper-right coordinates of the pitch.");
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] topRightStr =  firstLine.split(" ");
        if (topRightStr.length == 2) {
	        try {
	        	int[] upperCo = new int[2];
	        for (int i=0; i<topRightStr.length; i++){
	            upperCo[i] = Integer.parseInt(topRightStr[i]);
	        }
	        topRightX = upperCo[0];
	        topRightY = upperCo[1];
	        System.out.println(upperCo[0]+","+upperCo[1]);} 
	        catch(Exception e) {
	        	System.out.println("Invalid input.");
	        }
        }
        else {
        	System.out.println("Invalid input.");
        }

    }
	
	public void setStartPoint() {
    	System.out.println("Please type the start point location.");
    	Scanner scanner = new Scanner(System.in);
        String secondLine = scanner.nextLine();
        String[] startPoint =  secondLine.split(" ");
        if (startPoint.length == 3) {
        	try {
        		x = Integer.parseInt(startPoint[0]);
        		y = Integer.parseInt(startPoint[1]);
        		face = startPoint[2].charAt(0);
        		
        		System.out.println(startPoint[0]+","+startPoint[1]+","+startPoint[2]); }
        	catch(Exception e) {
        		System.out.println("Invalid input");
        	}
        }
        else {
        	System.out.println("Invalid input");
        }
        
    }

}
