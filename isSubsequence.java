import java.util.*;

public class isSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String a : ");
        String a = sc.next();
        System.out.println("Input String b : ");
        String b = sc.next();
        int i = 0 , j = 0;
        while(i < a.length() && j < b.length()) {
            if(a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }

        if(i == a.length()) {
            System.out.println("The Strings are Subsequence");
        }
        else {
            System.out.println("The Strings are not Subsequence");
        }
    }
}
