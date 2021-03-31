package Addition;

import java.util.Scanner;

class MyClass 
{
	private static void check(int array[] , int sum ,int t)
	{
		boolean test = false; 
        for (int i=0;i<t;i++) 
        { 
            if (array[i]== sum) 
            { 
            	test = true; 
            	System.out.println("Is " + sum + " present in the array: " + test);
                
                break; 
            } 
        } 
        if(test==false)
        	System.out.println("Is " + sum + "not present in the array: " + test);
                 
	}
	

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int n,i;
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			int t;
		
		 
		System.out.println("Enter the no. of arrays");
		 t = scan.nextInt();
		 int[] array = new int [t];
		 System.out.println("Enter the Arrays");
		 for(i=0;i<t;i++)
		 {
			 array[i]=scan.nextInt();
		 }
		
		 
			 int sum;
			 System.out.println("enter the two number");
			 int a = scan.nextInt();
			 int b = scan.nextInt();
			 
			 sum = a +b ;
			 check(array, sum,t);
		}
			 
			 
		 
			 
	}

}
