import java.util.Scanner;

public class containerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Size and Element of the array");
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Container with most water are : " +containerWithMostWater(nums));
    }
    public static int containerWithMostWater(int [] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        while(left < right) {
            int length = Math.min(nums[left] , nums[right]);
            int breath = (right - left) + 1;
            int area = length* breath;
            maxArea = Math.max(area, maxArea);
            right--;
            left++;
        }
        return maxArea;
    }
}
