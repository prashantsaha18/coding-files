import java.util.Arrays;
import java.util.Scanner;

public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the String array");
        int n = sc.nextInt();

        String [] strs = new String[n];

        for(int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        
        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);
        char [] first = strs[0].toCharArray();
        char [] last = strs[strs.length - 1].toCharArray();
        for(int i = 0; i < first.length; i++) {
            if(first[i] != last[i]) {
              break;
            }
            sb.append(first[i]);
        }
       System.out.println("Longest Common Prefix is : " +sb.toString());
    }
}