import java.util.Scanner;

public class matrixtranspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter elements of the matrix:");
        inputMatrix(sc, matrix);

        System.out.println("Transpose of the matrix:");
        int[][] transpose = transposeMatrix(matrix);
        displayMatrix(transpose);

        sc.close();
    }

    // Method to input matrix
    public static void inputMatrix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
