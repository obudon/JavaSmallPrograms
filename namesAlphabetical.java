import java.util.Scanner;

public class namesAlphabetical {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String[] names = new String[n];

        System.out.println("Enter 10 names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in alphabet order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}