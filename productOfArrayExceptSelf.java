import java.util.*;
public class productOfArrayExceptSelf {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int n = sc.nextInt();
    System.out.println("Input the Elements of the Array");
    int [] nums = new int[n];
    for(int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }
    int [] ans = productOfArrayExceptSelf(nums);
    System.out.println("Product of Sum Except Self");
    for(int i = 0; i < n; i++) {
        System.out.print(ans[i] + " ");
    }
    
    }
    public static int [] productOfArrayExceptSelf(int [] nums) {
        int zero = 0;
        int totalProduct = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zero++;

            else {totalProduct *= nums[i];}
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                if(zero == 0) {
                    nums[i] = totalProduct;
                }
                else {
                    nums[i] = 0;
                }
            }
            else if(nums[i] > 0) {
                if(zero == 0) {
                    nums[i] = totalProduct / nums[i];
                }
                else {
                    nums[i] = 0;
                }
            }
        }
        return nums;
    }
}
