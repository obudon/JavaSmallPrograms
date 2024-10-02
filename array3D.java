import java.util.Scanner;

public class array3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] array3D = {
            { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },
            { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
            { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
        };

        System.out.println("3D Array:");
        output3Darray(array3D);

        // Input a number from the user
        System.out.print("Enter a number to check if it's present in the array: ");
        int number = sc.nextInt();

        // Check if the number is present in the array
        boolean found = false;
        for (int[][] array2D : array3D) {
            for (int[] array1D : array2D) {
                for (int num : array1D) {
                    if (num == number) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println(number + " is present in the array.");
        } else {
            System.out.println(number + " is not present in the array.");
        }

        sc.close();
    }

    // Method to display a 3D array
    public static void output3Darray(int[][][] array3D) {
        for (int[][] array2D : array3D) {
            for (int[] array1D : array2D) {
                for (int num : array1D) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
