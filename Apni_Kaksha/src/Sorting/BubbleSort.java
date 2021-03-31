package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println("Enter The Array");
        int a[] = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = s.nextInt();
        }
        for (int j = 0; j < t - 1; j++) {
            boolean sorted = true;
            for (int i = 0; i < t - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted)
                break;
        }
        System.out.println("Sorted Array is :");
        // for (int i = 0; i < t; i++) {
        // System.out.print(a[i] + " ");
        // }
        for (int item : a) {
            System.out.print(item + " ");
        }

    }
}
