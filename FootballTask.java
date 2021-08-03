package com.lyraedu.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FootballTask {

    //variable upperCo[2]储存了右上角坐标，startPoint储存了起始点位置和方向

    public static void main(String[] args) {
    	int topRightX = 0;
    	int topRightY = 0;
    	//set top Right corner
    	System.out.println("Please type the upper-right coordinates of the pitch.");
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] topRight =  firstLine.split(" ");
        if (topRight.length == 2) {
	        try {
	        	int[] upperCo = new int[2];
	        for (int i=0; i<topRight.length; i++){
	            upperCo[i] = Integer.parseInt(topRight[i]);
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

        //set the start location
        System.out.println("Please type the start point location.");
        String secondLine = scanner.nextLine();
        String[] startPoint =  secondLine.split(" ");
        if (startPoint.length == 3 && Integer.parseInt(startPoint[0])<topRightX && Integer.parseInt(startPoint[1])<topRightY) {
        	try {System.out.println(startPoint[0]+","+startPoint[1]+","+startPoint[2].toUpperCase()); }
        	catch(Exception e) {
        		System.out.println("Invalid input");
        	}
        }
        else {
        	System.out.println("Invalid input");
        }

        
        //movement
        System.out.println("Please type movement.");
        String thirdLine = scanner.nextLine();

        int[] currentLocation = new int[2];
        currentLocation[0] = Integer.parseInt(startPoint[0]);
        currentLocation[1] = Integer.parseInt(startPoint[1]);
        int x = currentLocation[0];
        int y = currentLocation[1];
        String face = startPoint[2].toUpperCase();



        for(int i=0; i<thirdLine.length(); i++){
            char ch = thirdLine.charAt(i);
            
            if (x<0 || x>topRightX || 0>y || y>topRightY) {
            	System.out.println("out of boundry");
            	break;}
            else { //1
            
            switch (ch) {
                case 'L':
                    switch (face){
                        case "N":
                            face = "W";
                            break;
                        case "E":
                            face = "N";
                            break;
                        case "S":
                            face = "E";
                            break;
                        case "W":
                            face = "S";
                            break;
                    }
                    break;
                case 'R':
                    switch (face){
                        case "N":
                            face = "E";
                            break;
                        case "E":
                            face = "S";
                            break;
                        case "S":
                            face = "W";
                            break;
                        case "W":
                            face = "N";
                            break;
                    }
                    break;
                case 'M':
                    switch (face){
                        case "N":
                        	if (y+1<=topRightY)
                            y = y+1;
                        	else System.out.println("out of boundry");
                            break;
                        case "S":
                        	if (y-1>=0)
                            y = y-1;
                            break;
                        case "E":
                        	if (x+1<=topRightX)
                            x = x+1;
                            break;
                        case "W":
                        	if (x-1>=0)
                            x = x-1;
                            break;
                    }
                    break;



            }
            
            
            }//1
            
        }

        if (x>=0 && x<=topRightX && y>=0 && y<=topRightY) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(face);
        }



    }

    public void setConner() {
    	System.out.println("Please type the upper-right coordinates of the pitch.");
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] topRight =  firstLine.split(" ");
        if (topRight.length == 2) {
	        try {
	        	int[] upperCo = new int[2];
	        for (int i=0; i<topRight.length; i++){
	            upperCo[i] = Integer.parseInt(topRight[i]);
	        }
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
        	try {System.out.println(startPoint[0]+","+startPoint[1]+","+startPoint[2]); }
        	catch(Exception e) {
        		System.out.println("Invalid input");
        	}
        }
        else {
        	System.out.println("Invalid input");
        }
        
    }
    
  

}




