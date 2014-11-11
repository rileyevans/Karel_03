/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Riley Evans>  
* @version <11.2.14> 
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
            
            Display.openWorld("maps/mountain.map");
            Display.setSize(16, 16);
            Display.setSpeed(5);
            
            Climber riley = new Climber();
            Climber chloe = new Climber();
            
riley.turnRight();
   chloe.turnRight();
riley.move();  
   chloe.move();
riley.turnLeft();
   chloe.turnLeft();
riley.climbUpRight();
   chloe.climbUpRight();
riley.climbUpRight();
   chloe.climbUpRight();
riley.climbUpRight();
   chloe.climbUpRight();
riley.turnAround();
   chloe.turnAround();
riley.climbDownRight();
   chloe.climbDownRight();
riley.climbDownRight();
   chloe.climbDownRight();
riley.pickBeeper();
   chloe.turnAround();
riley.turnAround();
   chloe.climbUpLeft();
riley.climbUpLeft();
   chloe.climbUpLeft();
riley.climbUpLeft();
   chloe.turnAround();
riley.turnAround();
   chloe.climbDownLeft();
riley.climbDownLeft();
   chloe.climbDownLeft();
riley.climbDownLeft();
   chloe.climbDownLeft();
riley.climbDownLeft();
   chloe.turnRight();
riley.turnRight();
   chloe.move();
riley.move();
   chloe.turnRight();
riley.turnRight();
                                                
     }   
}