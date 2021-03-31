package whileLoop;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int x = 0, y = 0;
        while (t != 0) {
            x = t % 10;
            t = t / 10;
            y = y + x;
        }
        System.out.println(y);
    }
}