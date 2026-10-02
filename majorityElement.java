import java.util.*;
public class majorityElement {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array");
        int n = sc.nextInt();
        System.out.println("Input the elements of the array");
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Majority Element is : " + nums[n / 2]);
    }
}