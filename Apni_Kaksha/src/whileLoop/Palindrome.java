package whileLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int x = t, y = 0, z = 0;
        while (x > 0) {
            y = x % 10;
            x = x / 10;
            z = z * 10 + y;
        }

        if (t == z) {
            System.out.println("Number Is Palindrome");
        } else {
            System.out.println("Number Is Not Palindrome");
        }
    }

}
