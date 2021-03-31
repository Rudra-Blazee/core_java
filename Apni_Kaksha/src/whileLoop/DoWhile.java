package whileLoop;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] agrs) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        do {
            n = s.nextInt();
            System.out.println("Number Is " + n);
        } while (n != 0);
    }

}
