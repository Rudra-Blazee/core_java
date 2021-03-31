package fabruary_challange;

import java.util.*;

public class Maximum_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = s.nextInt();
			int[] array = new int[n];
			int j;
			for(j=0; j<n; j++)  
			{    
			array[j]=s.nextInt();  
			}
			Arrays.sort(array);
			int sum=0,num=0;
			num=array[n-1]-array[n-2];
			sum=sum+num;
			num=array[n-1]-array[0];
			sum=sum+num;
			num=array[n-2]-array[0];
			sum=sum+num;
			System.out.println(sum);
			
		}
	}

}
