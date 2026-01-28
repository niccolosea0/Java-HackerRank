import java.util.Scanner;
import java.util.InputMismatchException;

public class Solution {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                System.out.print("Enter number: ");
                long x = sc.nextLong();
                System.out.println("- " + x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                        System.out.println("\t* Byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                        System.out.println("\t* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                        System.out.println("\t* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                        System.out.println("\t* long");

            } catch (InputMismatchException e) {
                System.out.println(sc.next() + " can not be fit in anything");
            }
        }
         
    }

}
