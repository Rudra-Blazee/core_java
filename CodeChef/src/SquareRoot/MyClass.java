package SquareRoot;

import java.util.Scanner;

public class MyClass {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			
				for(int i=0;i<t;i++)
				{
					int b;
					
					int a = sc.nextInt();
				
					for(int j=1 ;j<=1000 ; j++)
					{
						b=j*j;
						if(b>=a)
						{
							if(b>a)
							{
								j=j-1;
							}
							else
							{
								j=j;
							}
							System.out.println(j);
							j=j+20;
							break;
						}
						
					}
				}

	}

}
