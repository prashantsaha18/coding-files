import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length and Element of the array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        int [] ans = twoSum(nums, target);
       
        for(int i = 0; i < 2; i++) {
           System.out.print(ans[i] + " ");
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        for(int i = 0; i < numbers.length - 1; i++) {
           for(int j = i; j < numbers.length; j++) {
            if((numbers[i] + numbers[j]) == target ) {
                return new int [] {i + 1, j + 1};
            }
           }
        }
        return new int [] {-1 , -1};
    }
}
