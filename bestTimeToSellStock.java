import java.util.Scanner;

public class bestTimeToSellStock {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array");
        int n = sc.nextInt();
        System.out.println("Input the elements of the array");
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Best time to Sell Stock is : " + bestTimeStock(nums));
    }
    public static int bestTimeStock(int [] nums) {
        int min = nums[0];
        int maxProfit = 0;

        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min , nums[i]);
            int currentProfit = nums[i] - min;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}
