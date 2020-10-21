package Problem19;
/* Kallan Brainard 
 * CS211
 * 6 July 2020 */

/* Your file header comment block goes above this line
 *
 * A client program that deals with simple points.
 * Minimal version, to accompany immutable Point class.
 */

public class PointMain {
	public static void main(String[] args) {
		// create some Point objects
		Point p1 = new Point(7, 2);
		Point p2 = new Point(4, 3);
		Point p3 = new Point(5, 3);
		Point p4 = new Point(2, 1);

		//call methods to compare point objects
		compareP1AndP2(p1, p2);
		compareP3AndP4(p3, p4);
		compareP2AndP3(p2, p3);
	}

	public static void compareP2AndP3(Point p2, Point p3) {
		System.out.println();
		System.out.println("Returns the greater coordinate pair by y-major order: ");
		System.out.println(p2 + " vs. " + p3);
		System.out.print("Result: ");

		if(p2.compareTo(p3)>0) {
			System.out.println(p2);
		} else {
			System.out.println(p3);
		}
	}

	public static void compareP3AndP4(Point p3, Point p4) {
		System.out.println();
		System.out.println("Returns the greater coordinate pair by y-major order: ");
		System.out.println(p3 + " vs. " + p4);
		System.out.print("Result: ");

		if(p3.compareTo(p4)>0) {
			System.out.println(p3);
		} else {
			System.out.println(p4);
		}
	}

	public static void compareP1AndP2(Point p1, Point p2) {
		System.out.println("Returns the greater coordinate pair by y-major order: ");
		System.out.println(p1 + " vs. " + p2);
		System.out.print("Result: ");
		
		if(p1.compareTo(p2)>0) {
			System.out.println(p1);
		} else {
			System.out.println(p2);
		}
	}
}
