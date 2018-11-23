package application;

import Algorithms.Coordinate;
import Algorithms.ISetupStrategy;
import Algorithms.SimpleSetup;

public class OptimizationLab {

	private Coordinate[] coords;
	private int fieldWidth;
	private int fieldHeight;
 	
	public OptimizationLab(int numberOfCircles, double radius) {
		ISetupStrategy strat = new SimpleSetup(numberOfCircles, radius);
		coords = strat.getCoordinates();
		fieldHeight = strat.getFieldsHeight();
		fieldWidth = strat.getFieldsWidth();
	}
}