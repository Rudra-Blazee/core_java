package conditionalStatement;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Input First Number as a");
		int a =s.nextInt();
	System.out.println("Input Second Number as b");
		int b=s.nextInt();
	System.out.println("Input Third Number as c");
		int c= s.nextInt();
	int result=0;
//	if(a>b)
//	{
//		if(a>c)
//		{
//			result=a;
//		}
//		else 
//			{
//				result=c;
//			}
//	}
//	else {
//		if(b>c)
//		{
//			result=b;
//		}
//		else {
//			result=c;
//		}
//	}
	result=a>b?a>c ?a:c : b>c ? b:c;
	System.out.println("Largest Number is : " + result);
	
	}

}
