package GasolineProblem;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int t = s.nextInt();
		
		for(int j=0;j<t;j++)
		{
			int n = s.nextInt();
			int a[]=new int[n];
		    int sum=0,c=0,y=0;
		
		for(int i = 0; i < n; i++)
        {
			
            a[i] = s.nextInt();
        }
		for(int i = 0; i < n; i++)
		{
            sum=sum+a[i];
            sum=sum-1;
            c++;
           if(sum<0)
            {
            	break;
            }
		
            
		}
        y=sum+c;
		
        System.out.println(y);
       
			
		
		
	}
}
}

