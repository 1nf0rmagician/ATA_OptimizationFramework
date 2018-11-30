package Algorithms;

public class SimpleSetup implements ISetupStrategy {

	int numberOfCircles;
	double radiusOfTheCircles;
	
	public SimpleSetup(int numberOfCircles, double radius) {
		this.numberOfCircles = numberOfCircles;
		this.radiusOfTheCircles = radius;
		
	}
	
	public Coordinate[] getCoordinates() {
		Coordinate[] coordinates = new Coordinate[numberOfCircles];
		double margin = 2*radiusOfTheCircles;
		int dimension = (int) Math.ceil(Math.sqrt(numberOfCircles));		
		
		for (int i = 0; i < dimension; i++) {
			int remainingCircles = Math.min(dimension, coordinates.length - i * dimension);
			for (int j = 0; j < remainingCircles ; j++) {
				int x = (int)(radiusOfTheCircles + (i*radiusOfTheCircles) + ((i+1)*margin));
				int y = (int)(radiusOfTheCircles + (j*radiusOfTheCircles) + ((j+1)*margin));
				
				coordinates[i*dimension + j] = new Coordinate(x, y);
			}
		}
		return coordinates;
	}
	
	

	public int getFieldsHeight() {
		double numberOfCirclesInHeight = Math.ceil(Math.sqrt(numberOfCircles));
		return (int)(Math.ceil(numberOfCirclesInHeight * 4 * radiusOfTheCircles) +  2*radiusOfTheCircles);
	}

	public int getFieldsWidth() {
		return getFieldsHeight();
	}
}
