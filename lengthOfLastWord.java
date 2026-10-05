import java.util.*;
public class lengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String or the Sentence : ");
        String s = sc.nextLine();
        String [] lastWord = s.trim().split("\\s+");
        int length = lastWord[lastWord.length - 1].length();
        System.out.println("Length of the last word is : " +length);
    }
}
