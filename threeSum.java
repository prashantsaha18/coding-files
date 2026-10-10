import  java.util.*;
public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Size and Element of the array");
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Three Sum are : " +threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int [] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n < 3) return new ArrayList<>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int left = i +1 ;
            int right = n - 1;
            while(left < right) {
            //    ArrayList<Integer> sum = new ArrayList<>();
               int sum = nums[i] + nums[left] + nums[right];
               if((nums[i] + nums[left] + nums[right]) == 0) {
                list.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                left++;
                right--;
               }
               else if(sum < 0) {
                left++;
               }
               else {
                right--;
               }
            }
        }
        return list;
    } 
}