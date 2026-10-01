import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int n = sc.nextInt();
       int [] nums = new int[n];
       System.out.println("Input the Array: ");
       for(int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
       }
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0;i < n ; i++) {
        set.add(nums[i]);
       }
       int length = set.size();
       int [] ans = new int [length];
       int j = 0;

        for (int value : set) {
            ans[j] = value;
            j++;
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
