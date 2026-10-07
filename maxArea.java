import java.util.* ;
public class maxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length and element of the array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum Area is : " +maxArea(nums));
    }
    public static int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0;
        int right = n - 1;
        while(left <= right) {
            int length = height[left];
            int breath = height[right];

            int area = Math.min(length, breath) * ((right - left) + 1);
            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
