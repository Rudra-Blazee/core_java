package Atm;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		double ava , x=0.50 ;
		Scanner scan = new Scanner(System.in);
		double wa = scan.nextDouble();
		double ta = scan.nextDouble();
		scan.close();
		
		if (wa+x<=ta)
		{
			if (wa%5==0)
			{
			 ava=ta-wa-x;
				System.out.printf("%.2f",ava);
			}	
				else 
				{
					System.out.printf("%.2f",ta);
				}
				
			}
		
	
		else 
		{
			System.out.printf("%.2f",ta);
		}
		}
	}


