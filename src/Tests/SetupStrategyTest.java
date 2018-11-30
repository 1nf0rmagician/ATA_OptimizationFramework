package Tests;

import Algorithms.Coordinate;
import Algorithms.SimpleSetup;

public class SetupStrategyTest {

	public static void CoordinatesTest() {
		SimpleSetup setup = new SimpleSetup(7, 2);
		System.err.println("Höhe:" + setup.getFieldsHeight());
		System.err.println("Weite:" + setup.getFieldsWidth());
		
		System.out.println("Punkt:\n");
		Coordinate[] coordinates = setup.getCoordinates();
		for (int i = 0; i < coordinates.length; i++) {
			System.out.println("X: " + coordinates[i].getX() + " Y: " + coordinates[i].getY());
		}
	}
}
