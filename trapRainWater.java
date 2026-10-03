import java.util.Scanner;

public class trapRainWater {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array");
        int n = sc.nextInt();
        System.out.println("Input the elements of the array");
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Rain water that is trapped is : " + trapRainWater(nums));
    }
    public static int trapRainWater(int [] height) {
        int n = height.length;
        if(n < 3) {
            return 0;
        }
        int [] left = new int[n];
        int [] right = new int[n];

        left[0] = height[0];
        for(int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1] , height[i]);
        }

        right[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1] , height[i]);
        }

        int water = 0;
        for(int i = 0; i < n; i++) {
            water += Math.min(left[i] , right[i]) - height[i];
        }
        return water;
    }
}
