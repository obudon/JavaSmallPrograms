public class CircleCalculations {
    public static void main(String[] args){
        double rad = 181.55;
        final double pi = 3.14;

        double area = pi * Math.pow(rad, 2);
        double circumference = 2 * pi * rad;

        System.out.println("Area of a circle with radius "+ rad + " is: " + area);
        System.out.println("Circumference of a circle with radius "+ rad + " is: " + circumference);
    }
}
