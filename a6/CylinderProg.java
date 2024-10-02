class Circle {
    // Creating a super class
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public String toString(){
        return "Circle [radius = " + radius + ", color: " + color + "]";
    }
}
class Cylinder extends Circle{
    // Inheriting the parent class
    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color );
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
    
}
public class CylinderProg{
    public static void main(String[] args){
        // Test a Circle class
        Circle circle = new Circle();
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        // Test a Cylinder class
        Cylinder cylinder = new Cylinder();
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}