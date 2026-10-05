import java.util.Scanner;

public class reverseWordInTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String or the Sentence : ");
        String s = sc.nextLine();
        String [] Word = s.trim().split("\\s+");
        int right = Word.length - 1;
        int left = 0;
        while(left < right) {
            String temp = Word[left];
            Word[left] = Word[right];
            Word[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.join(" " , Word));
    }
}
