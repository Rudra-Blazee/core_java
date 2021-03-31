package Arrays;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        System.out.println("Enter The Number Of Rows Of 1st Matrix ");
        Scanner s = new Scanner(System.in);
        int r1 = s.nextInt();
        System.out.println("Enter The Number Of Column Of 1st Matrix ");
        int c1 = s.nextInt();
        System.out.println("Enter The 1st Matrix :");
        int m1[][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter The Number Of Rows Of 2nd Matrix ");
        int r2 = s.nextInt();
        System.out.println("Enter The Number Of Column Of 2nd Matrix ");
        int c2 = s.nextInt();
        System.out.println("Enter The 2nd Matrix :");
        int m2[][] = new int[r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = s.nextInt();
            }
        }

        System.out.println("Addition Matrix Is :");
        int m3[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {
                m3[i][j] = 0;
                m3[i][j] = m1[i][j] + m2[i][j];
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
