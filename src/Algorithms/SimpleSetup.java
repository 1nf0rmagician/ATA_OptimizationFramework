package Algorithms;

public class SimpleSetup implements ISetupStrategy {

	int numberOfCircles;
	double radiusOfTheCircles;
	
	public SimpleSetup(int numberOfCircles, double radius) {
		this.numberOfCircles = numberOfCircles;
		this.radiusOfTheCircles = radius;
	}
	
	public Coordinate[] getCoordinates() {
		return new Coordinate[numberOfCircles];
	}

	public int getFieldsHeight() {
		double numberOfCirclesInHeight = Math.ceil(Math.sqrt(numberOfCircles));
		return (int)Math.ceil(numberOfCirclesInHeight * 3 * radiusOfTheCircles);
	}

	public int getFieldsWidth() {
		return getFieldsHeight();
	}

	
}
