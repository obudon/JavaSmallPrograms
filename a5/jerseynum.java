import java.util.HashMap;
import java.util.Scanner;

public class jerseynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> player = new HashMap<Integer, String>();

        player.put(10, "Pele");
        player.put(7, "Ronaldo");
        player.put(9, "Haaland");

        System.out.println("Enter the jersey number of choosen player(7,9,10)");
        Integer num = sc.nextInt();

        if(player.containsKey(num)){
            String name = player.get(num);
            System.out.println("Player " + name + " is playing under jersey number" + num);
        } else {
            System.out.println("There is no such a number of player");
        }
        sc.close();
    }
}
