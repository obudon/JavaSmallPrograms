public class WeightPlanet {
    public static void main(String[] args)  {
        int weight = 50;
        double mercury = 0.4, venus = 0.9, jupiter = 2.5, saturn = 1.1;

        double weightM = weight * mercury, weightV = weight * venus, weightJ = weight * jupiter, weightS = weight * saturn;

        System.out.println(weightM);
        System.out.println(weightV);
        System.out.println(weightJ);
        System.out.println(weightS);
    }
}