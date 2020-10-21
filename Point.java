package Problem19;
/*Kallan Brainard 
 * CS211
 * 6 July 2020 */

/* Your file header comment block goes above this line
 * A Point object represents a pair of (x, y) coordinates.
 * Class invariant: x >= 0 && y >= 0. (Quadrant I only)
 */
import java.lang.Comparable;

public class Point implements Comparable <Point> {
	private int x;
	private int y;

	// Constructs a new point at the given (x, y) location.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Returns the x-coordinate of this point.
	public int getX() {
		return this.x;
	}

	// Returns the y-coordinate of this point.
	public int getY() {
		return this.y;
	}

	// Returns a String representation of this point.
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	//Method to compare the two point objects with their y values and breaks ties with x values 
	public int compareTo(Point other) {
		Point otherPoint = (Point)other;

		if (y != other.y) {
			return y - otherPoint.y;
		} else {
			return x - otherPoint.x;
		}
	}
}

