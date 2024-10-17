package HelbertDias;
import robocode.*;


/**
 * FURY - a robot by (Helbert Dias Torres)
 */
public class FURY extends Robot
{
	/**
	 * run: FURY's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(150);
			turnGunRight(360);
			turnRight(180);
			ahead(150);
			turnGunRight(360);
		}
	}
		public void onScannedRobot(ScannedRobotEvent e) {
		fire(2);
	}

		public void onHitByBullet(HitByBulletEvent e) {
		ahead(100);
		turnLeft(90);
		
	}
		public void onHitWall(HitWallEvent e) {
		back(50);
		turnRight(100);
		ahead(100);
	}
		public void onHitRobot(HitRobotEvent inimigo) {
		turnRight(inimigo.getBearing());
		fire(3);

	}
}
