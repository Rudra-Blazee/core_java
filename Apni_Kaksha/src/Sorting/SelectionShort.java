package Sorting;

import java.util.Scanner;

public class SelectionShort {

    public static void main(String[] agrs) {
        System.out.println("Enter The Number");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        System.out.println("Enter The Array");
        int a[] = new int[t];

        for (int i = 0; i < t; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < t - 1; i++) {
            int minInd = i;
            for (int j = i; j < t; j++) {

                if (a[j] < a[minInd]) {
                    minInd = j;
                }
            }
            int temp = a[i];
            a[i] = a[minInd];
            a[minInd] = temp;
        }
        for (int e : a) {
            System.out.print(e + " ");
        }

    }
}
