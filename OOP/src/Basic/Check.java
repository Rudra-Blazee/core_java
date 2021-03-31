package Basic;

import java.util.*;

public class Check {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double k = scan.nextDouble();
        scan.nextLine();
        String l = scan.nextLine();

        j = j + i;
        k = k + d;
        System.out.println(j);
        System.out.println(k);
        System.out.println(s + l);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables. */
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */

        scan.close();
    }
}
