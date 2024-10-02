import java.util.ArrayList;
import java.util.List;

class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Point point : points) {
            result.append("(").append(point.getX()).append(", ").append(point.getY()).append(") ");
        }
        return result.toString();
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            length += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }
        return length;
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Polylineprog1 {
    public static void main(String[] args) {
        // Creating points
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        // Creating polyline and appending points
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(p1);
        polyline.appendPoint(p2);
        polyline.appendPoint(p3); // Appending point using x and y coordinates

        // Displaying the polyline
        System.out.println("Polyline: " + polyline);
        
        // Calculating and displaying the length of the polyline
        System.out.println("Length of the polyline: " + String.format("%.2f", polyline.getLength()));
    }
}
