import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i=0; i<10; i++){
            int num = sc.nextInt();
            if (num % 2 != 0){
                oddCount++;
            } else {
                evenCount++;
            }
        }
        System.out.println("Even numbers are: "+ evenCount);
        System.out.println("Odd numbers are: " + oddCount);
        sc.close();
    }
}
