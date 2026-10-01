import java.util.*;

public class removeElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array element: ");
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
		}
        System.out.println("Remove the Element you want to remove");
        int remove = sc.nextInt();
        int n1 = removeElements(arr, remove);
        System.out.println(n1);
        int [] arr1 = new int[n1];
        int j = 0;

       for(int i = 0; i < n; i++) {
         if(arr[i] != remove) {
            arr1[j] = arr[i];
            j++;
        }
        }
        System.out.println("Removed Element");
        for(int i = 0; i < n1; i++) {
			System.out.print(arr1[i] + " " );
		}

    }
    public static int removeElements(int [] nums , int n) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
          if(nums[i] == n) {
            count += 1;
          } 
        }
        return nums.length - count;
    }
}