package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*width + 2*length;
	}
	
	public boolean isSmaller(Rectangle r) {
		return this.getArea() < r.getArea();
	}
	
	public void draw() {
		StdDraw.setPenColor(100, 0, 0);
		StdDraw.rectangle(0.5, 0.5, width/2, length/2);
		
	}
	
	public String toString() {
		return "Area: " + String.valueOf(this.getArea()) + "\nPerimeter: " + String.valueOf(this.getPerimeter());
		
	}
	
	public static void main (String[] args) {
		Rectangle r1 = new Rectangle(0.2, 0.4);
		r1.draw();
		System.out.println(r1.toString());
	}
	

}
