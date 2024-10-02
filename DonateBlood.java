public class DonateBlood {
    public static void main(String[] args){
        int aliceWeight = 50;
        int aliceAge = 19;

        int bobWeight = 36;
        int bobAge = 20;

        int jemmyWeight = 45;
        int jemmyAge = 17;

        int cliveWeight = 100;
        int cliveAge = 80;

        System.out.println("Alice: " + Possibility(aliceAge, aliceWeight));
        System.out.println("Bob: " + Possibility(bobAge, bobWeight));
        System.out.println("Jemmy: " + Possibility(jemmyAge, jemmyWeight));
        System.out.println("Clive: " + Possibility(cliveAge, cliveWeight));
    }
    public static String Possibility(int age, int weight){
        if (age >= 18 && age <= 60 && weight > 40) {
            return "Yes, it is possible to donate blood";
        }
        else {
            return "No, it is not possible to donate a blood";
        }
    }
}
