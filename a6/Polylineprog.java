import java.util.ArrayList;
import java.util.List;

class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class PolyLine {
    private List<Point> points;

    public PolyLine(){
        points = new ArrayList<>();
    }
    public PolyLine(List<Point> points){
        this.points = new ArrayList<>(points);
    }
    public void appendPoint(int x, int y){
        points.add(new Point(x, y));
    }
    public void appendPoint(Point point){
        points.add(point);
    }
    //Display the points 
    public String toString(){
        String result = "{";
        for (Point point : points){
            result += "(" + point.getX() + "," + point.getY() + ")";
        }
        result += "}";
        return result;
    }
    public double getLength(){
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++){
            Point p1 = points.get(i);
            Point p2 = points.get(i+1);
            //Сalculating line length from coordinates
            length += Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2)+Math.pow(p2.getY()-p1.getY(), 2));
        }
        return length;
    }
}
//Test a program
public class Polylineprog{
    public static void main(String[] args){
        //Create points 
        Point p = new Point(1, 2);
        Point p1 = new Point(2,3);
        //Attaching points into polyline
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(p);
        polyline.appendPoint(p1);
        //Display the points 
        System.out.println("Polyline: "+polyline);
        //Display the length
        System.out.println("Polylien's length is: " + String.format("%.2f", polyline.getLength()));
    }
}
