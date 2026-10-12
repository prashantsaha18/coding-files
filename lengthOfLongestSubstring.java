import java.util.Scanner;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String : ");
        String s = sc.next();
        System.out.println("Longest Common substring are : " +lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int [] nextIndex = new int[256];

        for(int r = 0 , l = 0; r < n; r++) {
          l = Math.max(nextIndex[s.charAt(r)] , l);
          longest = Math.max(r - l + 1 , longest);
          nextIndex[s.charAt(r)] = r + 1;
        }
        return 0;
    }
}