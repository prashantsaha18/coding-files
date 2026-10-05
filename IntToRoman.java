import java.util.Scanner;

public class IntToRoman {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input the Integer Number : ");
       int s = sc.nextInt();
       System.out.println("Roman Number is : " +IntToRoman(s));
    }
    public static String IntToRoman(int n) {
        final int [] values = {1000 , 900 , 500 , 400 , 100 , 90 , 50 ,40 ,10 ,9 , 5 , 4 , 1};
        final String [] symbols = {"M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" , "I"};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++) {
            if(n == 0) break;
            while(n >= values[i]) {
                sb.append(symbols[i]);
                n -= values[i];
            }
        }

        return sb.toString();
    }
}
