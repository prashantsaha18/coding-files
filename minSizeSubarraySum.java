import java.util.Scanner;

public class minSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size and elements of the array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Target value is : ");
        int target = sc.nextInt();
        int ans = minSizeSubarraySum(nums, target);
        System.out.println("Minimum Size of Subarray Sum is : " +ans);
    }
    public static int minSizeSubarraySum(int [] nums , int target) {
        int left = 0 , right , sumOfCurrentSum = 0;
        int res = Integer.MAX_VALUE;

        for(right = 0; right < nums.length; right++) {
            sumOfCurrentSum += nums[right];

            while(sumOfCurrentSum >= target) {
                res = Math.min(res , right - left + 1);
                sumOfCurrentSum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
