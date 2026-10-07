import java.util.Scanner;

public class isPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String : ");
        String a = sc.nextLine();
        String s = a.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        char [] original = s.toCharArray();
        char [] reverse = new char[original.length];
        int n = original.length;
        int idx = 0;
        for(int i = n - 1; i <= 0; i--) {
           reverse[idx++] = original[i];
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(original[i] != reverse[i]) {
                System.out.println("It is not a Palindrome String");
                break;
            }
            count += 1;
        }
        if(count == n) {
            System.out.println("The givem String is a Palindrome String");
        }
    }
}
