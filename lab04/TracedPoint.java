import java.awt.Point;

public class TracedPoint extends Point {

    public TracedPoint(int x, int y) {
        super(x, y);
    }
	

    // Your move method goes here.
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void printPoint(Point p) {
		// System.out.println(getClass(p));
		System.out.println(p);
	}

    public static void main(String[] args) {
        TracedPoint p1 = new TracedPoint(5, 6);
        p1.move(3, 4); // prints: "point moved from (5,6) to (3,4)
        p1.move(9, 10); // prints: "point moved from (3,4) to (9,10)

        TracedPoint p2 = new TracedPoint(25, 30);
        p2.move(45, 50); // prints: "point moved from (25,30) to (45,50)

        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
		/*TracedPoint tp = new TracedPoint(2, 3);
		printPoint(tp);
		System.out.println(tp);*/
		//TracedPoint tp = new TracedPoint();
		
    }
}
