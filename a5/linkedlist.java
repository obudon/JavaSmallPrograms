import java.util.ArrayList;

public class linkedlist {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(11);
        nums.add(22);
        nums.add(6);
        nums.add(89);
        nums.add(99);
        System.out.println("Array List is: ");
        System.out.println(nums);

        nums.add(2, 50);
        System.out.println("Inserting 50 at the third position:");
        System.out.println(nums);
        
        nums.remove(1);
        System.out.println("Deleting the second element:");
        System.out.println(nums);
        
        nums.remove(0);
        System.out.println("Deleting the first element:");
        System.out.println(nums);
        
        nums.remove(nums.size() - 1);
        System.out.println("Deleting the last element:");
        System.out.println(nums);
    }
}
