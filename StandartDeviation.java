import java.util.Scanner;

public class StandartDeviation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of real numbers: ");
        int N = sc.nextInt();
        double[] numArray = new double[N];

        System.out.println("Enter (" + N + ") real numbers");
        for (int i=0; i<N; i++){
            numArray[i] = sc.nextDouble();
        }
        double SD = calculateSD(numArray);
        System.out.format("Standart Deviation = %.6f", SD);
        // sc.close();
    }
    public static double calculateSD(double numArray[]){
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for (double num : numArray) {
            sum += num;
        }

        double mean = sum / length;

        for (double num : numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }
}
