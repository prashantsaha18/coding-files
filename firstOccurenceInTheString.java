import java.util.Scanner;

public class firstOccurenceInTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Haystack : ");
        String a = sc.next();
        System.out.println("Needle : ");
        String b = sc.next();

        int index = a.indexOf(b);
        System.out.println("First occurence of the String is : " +index);
    }
}
