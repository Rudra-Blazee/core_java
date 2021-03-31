package Add1StLast;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int t = sc.nextInt();
		
		
		
		for(int i=0;i<t;i++)
		{
			int a , sum ;
		
			
			
			int x = sc.nextInt();
			a= x%10;
			while (x >=10)
			{
				x=x/10;
				
			}
			
			sum=a+x;
			System.out.println(sum);
			
		}
		
		
		
		

	}

}
