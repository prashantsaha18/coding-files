import java.util.Scanner;

public class rotateArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int [] ans = new int[n];
        
        int idx = 0;
        for(int i = k + 1; i < n; i++)
            ans[idx++] = nums[i];
        
        for(int i = 0; i <= k; i++) {
            ans[idx++] = nums[i];
        }
        
        for(int i = 0; i < n; i++)
        System.out.print(ans[i] + " ");
    }
    
}
