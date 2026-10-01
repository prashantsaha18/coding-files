import java.util.*;
public class merge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the first array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array 1 element: ");
		int [] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
           arr1[i] = sc.nextInt();
		}

		System.out.println("Please enter the size of the Second array: ");
		int m = sc.nextInt();
		System.out.println("Enter the array 1 element: ");
		int [] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
           arr2[i] = sc.nextInt();
		}

		System.out.println("Enter the merge values index l1 and l2");
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();

		merge(arr1 , l1 , arr2 , l2);
		System.out.println("Merged array is given below");
		for(int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " " );
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int idx = 0;
		for(int i = m; i < m + n; i++) {
            nums1[i] = nums2[idx++];
		}
		Arrays.sort(nums1);
	}
}
