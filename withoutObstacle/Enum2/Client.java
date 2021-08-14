package com.lyraedu.sample.Enum2;

public class Client {

	public static void main(String[] args) {
		Location location = new Location(5,5,'N');
		Boundry boundry = new Boundry(10,10);
		final String cmd = "LMRM";
		DotObstacle obstacle = new DotObstacle();
		obstacle.setObstacle(new Location(4,6,'N'));
		
		if (Validation.isValidPositionStr(cmd)) {
		Context context = new Context();
		context.addStrategy(new TurnLeft());
		context.addStrategy(new TurnRight());
		context.addStrategy(new MoveForward());
		
		RunCmd execute = new RunCmd();
		execute.RunChar(context, location, cmd, boundry).printLocation();
		}
		else {System.out.println("Invalid input");}
	}

}
