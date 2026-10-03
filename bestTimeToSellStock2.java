import java.util.Scanner;

public class bestTimeToSellStock2 {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array");
        int n = sc.nextInt();
        System.out.println("Input the elements of the array");
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Best time to Sell Stock is : " + bestTimeStocks(nums));
    }
    public static int bestTimeStocks(int [] nums) {
        int max = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
            max += (nums[i] - nums[i - 1]);
            }
        }
        return max;
    }
}
