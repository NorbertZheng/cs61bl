/** A class that represents a path via pursuit curves. */
public class Path {

    // TODO
	private Point curr;
	private Point next;
	
	public Path(double x, double y) {
		this.curr = new Point(x, y);
		this.next = new Point(x, y);
	}
	
	public double getCurrX() {
		return this.curr.getX();
	}
	
	public double getCurrY() {
		return this.curr.getY();
	}
	
	public double getNextX() {
		return this.next.getX();
	}
	
	public double getNextY() {
		return this.next.getY();
	}
	
	public Point getCurrentPoint() {
		return this.curr;
	}
	
	public void setCurrentPoint(Point point) {
		this.curr = point;
	}
	
	public void iterate(double dx, double dy) {
		this.curr.setX(this.next.getX());
		this.curr.setY(this.next.getY());
		this.next.setX(this.next.getX() + dx);
		this.next.setY(this.next.getY() + dy);
	}
}
