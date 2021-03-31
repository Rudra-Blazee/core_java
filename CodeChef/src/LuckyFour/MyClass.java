package LuckyFour;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
			for(int i=0;i<t;i++)
			{
				int num=0,b;
				int a = sc.nextInt();
				while(a!=0)
				{
					b=a%10;
					a=a/10;
					if(b==4)
					{
						num+=1;
					}
					else 
					{
						num=num;
					}
				}
				System.out.println(num);
			}
	}

}
