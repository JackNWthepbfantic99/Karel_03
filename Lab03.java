/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
     Display.openWorld("maps/mountain.map");
     Display.setSize(16, 16);
     Climber jack = new Climber(8);
     Climber tenzing = new Climber(8);
               jack.turnRight();
               tenzing.turnRight();
               jack.move();
               tenzing.move();
               jack.turnLeft();
               tenzing.turnLeft();
               jack.climbupRight();
               tenzing.climbupRight();
               jack.climbupRight();
               tenzing.climbupRight();
               jack.climbupRight();
               tenzing.climbupRight();               
               jack.climbdownRight();
               tenzing.climbdownRight();
               jack.climbdownRight();
               tenzing.climbdownRight();
               jack.pickBeeper();
               jack.climbupLeft();
               tenzing.climbupLeft();
               jack.climbupLeft();
               tenzing.climbupLeft();
               jack.climbdownLeft();
               tenzing.climbdownLeft();
               jack.climbdownLeft();
               tenzing.climbdownLeft();
               jack.climbdownLeft();
               tenzing.climbdownLeft();
               jack.turnLeft();
               tenzing.turnLeft();
               jack.move();
               tenzing.move();
               
     }
 }
