class Shape{
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "red"; //I put the red color as it was in diagrams
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        return "Shape[color = "+color+", filled = "+filled+"]";
    }
}
class Circle extends Shape{
    private double radius;
    
    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    } 
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle[Shape[color = " +getColor()+", filled = "+isFilled()+"], radius = " + radius;
    }
}
class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public String toString(){
        return "Rectangle[Shape[color = " + getColor()+", filled = "+isFilled()+"], width = "+width+", length = "+ length;
    }
}
class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side); //One side we take width and another is length from class Rectangle
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    } 
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString(){
        return "Square[Rectangle[Shape[color = "+ getColor()+", filled = "+isFilled()+"], width = "+getWidth()+", length = "+getLength()+"]]";
    }
}
public class ShapeProg {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Circle circle1 = new Circle();
        System.out.println(circle1);
    
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
    
        Square square1 = new Square();
        System.out.println(square1);
    }
}