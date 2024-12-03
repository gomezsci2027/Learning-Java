package Java102.Java102;

public class Point {
    public final double x;
    public final double y;    

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        
    }

    public Point translateX(double t) {
		return new Point(x + t, y);
	}
	
	public Point translateY(double t) {
		return new Point(x, y + t);
	}


    Point xTranslation = point.translateX(3); // should be (7, 3)
    Point yTranslation = point.translateY(-7); // should be (4, -4)
    Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)

    public static void main(String[] args) {

        System.out.println("x transl: (" + xTranslation.x + ", " + xTranslation.y + ")");
        System.out.println("y transl: (" + yTranslation.x + ", " + yTranslation.y + ")");
        System.out.println("xy transl: (" + xyTranslation.x + ", " + xyTranslation.y + ")");
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + "  y: " + point.y);

        
    }
       
}

