package HelbertDias;
import robocode.*;
import static robocode.util.Utils.*;
import java.awt.Color;

/**
 * FURY - a robot by (Helbert Dias Torres)
 */
public class FURY extends Robot
{
    public void run() {  
        setColors(Color.RED, Color.BLUE, Color.YELLOW); 
        while (true) {
        	for(int voltasDir =0; voltasDir<2; voltasDir++){
			ahead(200);
            		turnGunRight(360);
            		scan();
            		turnRight(90);}
		for(int voltasEsq =2; voltasEsq>0; voltasEsq--){
			ahead(200);
            		turnGunRight(360);
            		scan();
            		turnRight(90);}
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
         
            fire(2);
        
    }

    public void onHitByBullet(HitByBulletEvent e) {
        scan();
		turnGunRight(360);
		ahead(200);
        turnLeft(90);
        
    }

    public void onHitWall(HitWallEvent e) {
        back(30);
        turnRight(90);
        ahead(150);
    }

    public void onHitRobot(HitRobotEvent e) {
        double bearing = e.getBearing();
        double heading = getHeading();
        double gunHeading = getGunHeading();

        double turnGunAmt = normalRelativeAngleDegrees(bearing + heading - gunHeading);
        turnGunRight(turnGunAmt);
	fire(3);
        
    }
}
