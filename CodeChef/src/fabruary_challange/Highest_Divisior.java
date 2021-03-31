package fabruary_challange;

import java.util.Scanner;

public class Highest_Divisior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int t = s.nextInt();
		int a=0,b=1;
		for(int i=2;i<11;i++)
		{
			a=t%i;
			if(a==0)		
			{
				b=i;
			}
		}
		System.out.println(b);
	}

}
