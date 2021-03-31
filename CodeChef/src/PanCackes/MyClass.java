package PanCackes;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int t = s.nextInt();
		
		for(int j=0;j<t;j++)
		{	
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if(a>b)
			{
				if(b>c)
				{
					System.out.println(b);
				}
				else
				{
					if(a<c)
					{
						System.out.println(a);
					}
					else
					{
						System.out.println(c);
					}
					
				}
			}
			else
			{
				if(b<c)
				{
					
						System.out.println(b);
					
				}
				else
				{
					if(a<c)
					{
						System.out.println(c);
					}
					else
					{
						System.out.println(a);
					}
				}
					
			}
				
		}
		
		}

	}


