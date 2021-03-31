package Arrays;

import java.util.Scanner;

public class AvgMarksStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number Of Student");
        int n = s.nextInt();

        System.out.println("Enter The Marks Of The Student");
        int marks[] = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = s.nextInt();
        }
        int avg = 0;
        for (int i = 0; i < n; i++) {
            avg = avg + marks[i];
        }

        avg = avg / n;
        System.out.println("Average Marks Is: " + avg);

    }

}
