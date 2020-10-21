package Problem20;
/*Kallan Brainard  
 * CS211
 * 6 July 2020 */
/* 
 * Your file header comment block goes above this line
 * TimeSpanClient: a simple test client for the TimeSpan class
 * Shows creation of an instance object, displaying that object,
 * adding hours and minutes to that object, and showing the result.
 */
public class TimeSpanClient {
	public static void main(String[] args) {
		int h1 = 13, m1 = 30;
		TimeSpan t1 = new TimeSpan(h1, m1);
		
		System.out.println("-1 = less than | 1 = greater than | 0 = equal to");
		System.out.println("------------------------------------------------");
		
		System.out.println("New object t1: " + t1);
		h1 = 3; m1 = 40;
		System.out.println("Adding " + h1 + " hours, " + m1 + " minutes to t1");        
		t1.add(h1, m1);
		System.out.println("New t1 state: " + t1);
		TimeSpan t2 = new TimeSpan(10,20);
		System.out.println("New object t2: " + t2);
		System.out.println();
		System.out.println("Timespan 1 compared to Timespan 2: " + t1.compareTo(t2));
		System.out.println("Timespan 2 compared to Timespan 1: " + t2.compareTo(t1));
		System.out.println("Timespan 1 compared to Timespan 1: " + t1.compareTo(t1));
	}
}