import java.util.Scanner;
public class TwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first string: ");
        String input1 = sc.nextLine();
        System.out.println("Enter your second string: ");
        String input2 = sc.nextLine();
        // Concatenates the strings
        String union = input1 + " " + input2;
        System.out.println("Output 1: " + union);
        // Prints the number of characters present in the strings (this will exclude the blank spaces)
        int countChar = union.replaceAll("\\s", "").length();
        System.out.println("Output 2: " + countChar);
        // Prints the concatenated string in the reverse order
        String rev = "";
        String s[] = union.split(" ");
        for(int i=0;i<s.length;i++){
            rev = s[i]+" "+rev;
        }
        System.out.println("Output 3: " + rev);
        // Prints the characters which occurs twice
        System.out.print("Output 4: ");
        occursTwice(union);
        sc.close();
    }
    private static void occursTwice(String str){
        int [] countChar = new int[256];
        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            countChar[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (countChar[i] == 2) {
                result.append((char) i);
            }
        }
        System.out.println(result);
    }  
}