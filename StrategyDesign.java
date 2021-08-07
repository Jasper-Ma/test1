package com.lyraedu.sample;
import java.util.HashMap;
import java.util.Map;

import com.lyraedu.sample.StrategyDesign.Context;
import com.lyraedu.sample.StrategyDesign.Left;
import com.lyraedu.sample.StrategyDesign.Right;

public class StrategyDesign {

	enum RotateStrategyEnum{
		TurnLeft, TurnRight
	}
	
	class Directions {
		char currentDirection;
		char nextDirection;
	}
	
	public interface RotateStrategy {
		//interface的functions?
		char operate(Directions directions);
		RotateStrategyEnum getStrategy();
	}
	
	class Left implements RotateStrategy{

		@Override
		public char operate(Directions directions) {
			 switch (directions.currentDirection){
             case 'N':
            	 directions.nextDirection = 'W';
                 break;
             case 'E':
            	 directions.nextDirection = 'N';
                 break;
             case 'S':
            	 directions.nextDirection = 'E';
                 break;
             case 'W':
            	 directions.nextDirection = 'S';
                 break;
         }
			 return directions.nextDirection;
		}

		@Override
		public RotateStrategyEnum getStrategy() {
			return RotateStrategyEnum.TurnLeft;
		}
		
		
		
	} 
	
	class Right implements RotateStrategy{

		@Override
		public char operate(Directions directions) {
			switch (directions.currentDirection){
            case 'N':
            	directions.nextDirection = 'E';
                break;
            case 'E':
            	directions.nextDirection = 'S';
                break;
            case 'S':
            	directions.nextDirection = 'W';
                break;
            case 'W':
            	directions.nextDirection = 'N';
                break;
        }
			return directions.nextDirection;
		}

		@Override
		public RotateStrategyEnum getStrategy() {
			return RotateStrategyEnum.TurnRight;
		}
		
	}
	
	class Context {
		private Map<RotateStrategyEnum, RotateStrategy> strategiesMap = new HashMap<RotateStrategyEnum, RotateStrategy>();
	
		public void addStrategy(RotateStrategy rotateStrategy) {
			//这行没看懂。
			strategiesMap.put(rotateStrategy.getStrategy(), rotateStrategy);
		}
	
		public char executeStrategy(RotateStrategyEnum rotateStrategyEnum, Directions directions) {
			return strategiesMap.get(rotateStrategyEnum).operate(directions);
		}
	}

	public static void main(int topRightX, int topRightY, int x, int y, String movement) {
		Football task = new Football();
		task.setTopRightX(topRightX);
		task.setTopRightY(topRightY);
		task.setX(x);
		task.setY(y);
		
		StrategyDesign strategyDesign = new StrategyDesign();
		Context context = strategyDesign.new Context();
		
		context.addStrategy(strategyDesign.new Left());
		context.addStrategy(strategyDesign.new Right());
			
		for(int i=0; i<movement.length(); i++){
		   char ch = movement.charAt(i);
		   Directions directions = strategyDesign.new Directions();
		   directions.currentDirection = ch;
		   directions.nextDirection=' ';
		   
		   switch (ch) {
		   case 'L':
			   task.setFace(context.executeStrategy(RotateStrategyEnum.TurnLeft, directions));
			   break;
		   
		   case 'R':
			   task.setFace(context.executeStrategy(RotateStrategyEnum.TurnRight, directions));
			   break;
			   
		   case 'M':
			   switch (task.getFace()){
               case 'N':
               	if (task.getY()+1<=topRightY)
                   task.setY(task.getY()+1);
               	else System.out.println("out of boundry");
                   break;
               case 'S':
               	if (task.getY()-1>=0)
                   task.setY(task.getY()+1);
                   break;
               case 'E':
               	if (task.getX()+1<=topRightX)
               	   task.setX(task.getX()+1);
                   break;
               case 'W':
               	if (task.getX()-1>=0)
               	   task.setX(task.getX()+1);
                   break;
           }
           break;
		   }
		}
	}
	
	
	

}

