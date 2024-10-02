import java.util.Scanner;

public class matrixaddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        System.out.println("Enter elements of first matrix:");
        inputmatrix(sc, a);

        System.out.println("Enter elements of second matrix:");
        inputmatrix(sc, b);

        int[][] c = new int[3][3]; 

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j]; 
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); 
        }

        sc.close();
    }

    // Method to input matrix
    public static void inputmatrix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}
