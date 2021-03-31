package SmallFactorial;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
{
		Scanner s=new Scanner (System.in);
		int t = s.nextInt();
		
		for(int j=0;j<t;j++)
		{
			int c=0,n=1,b=1;
			int ta = s.nextInt();
			
			
			while(ta != 0)
			{
				n = 1;
				while(n*2 <= ta)
					n = n*2;
				c++;
				ta -= n;
			}
			
			System.out.println(c);
		
	}
}
}


