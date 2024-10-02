import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> subjects = new ArrayList<String>();

        System.out.println("Enter the subjects taught in the computer science department");
        System.out.println("Enter *finish* when you finished");

        String subject;
        while(true){
            subject = sc.nextLine();
            if (subject.equalsIgnoreCase("finish")){
                break;
            }
            subjects.add(subject);
        }

        if (subjects.remove("Networking")) {
            System.out.println("Networking was removed from the list");
        } else{
            System.out.println("Networking was not found in the list");
        }

        Collections.sort(subjects, Collections.reverseOrder());

        System.out.println("The new array list");
        for (String newSubjects : subjects){
            System.out.println(newSubjects);
        }
        sc.close();
    }
}
