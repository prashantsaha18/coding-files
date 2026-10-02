import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array");
        int n = sc.nextInt();
        System.out.println("Input the elements of the array");
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Input the value of k : ");
        int k = sc.nextInt();
        System.out.println("Rotated Array is : ");
        int [] ans = rotate(nums, k);
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int [] rotate(int [] nums , int k) {
        int[] rotated = new int[nums.length];
        int n = nums.length;
        int l = n - k ;
        int idx = 0;
        for(int i = l; i < n; i++) {
           rotated[idx++] = nums[i];
        }
        for(int i =0; i < l; i++) {
            rotated[idx++] = nums[i];
        }
        return rotated;
    }
}
