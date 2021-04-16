import java.util.*;
 
 
public class test {
 
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
			for(int i=0;i<t;i++)
			{
				
				int a = sc.nextInt();
				while(a>1)
				{
				System.out.print(a);
				break;
				}
				for(int j=1;j<a;j++)
				{
					
					System.out.print(" " +j);
				
					
				}
				
				System.out.println();
			}
	}
}