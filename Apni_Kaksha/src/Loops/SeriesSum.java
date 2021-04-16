package Loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		float result = 0;
		for (float i = 1; i <= t; i++) {
			result += 1 / i;
		}
		System.out.println(result);
	}

}
