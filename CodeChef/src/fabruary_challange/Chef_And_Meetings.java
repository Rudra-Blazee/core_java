package fabruary_challange;
import java.util.*;

import org.graalvm.compiler.lir.amd64.vector.AMD64VectorMove.SaveRegistersOp;


public class Chef_And_Meetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		int t = s.nextInt();
		s.nextLine();
		for(int i=0;i<t;i++)
		{
			String us1;
			us1=s.nextLine();
			System.out.println(us1);
			int num=0;
			if(us1.charAt(0)=='1' && us1.charAt(1)=='2' && us1.charAt(6)=='A' && us1.charAt(7)=='M' )
			{
				num=(us1.charAt(3)-'0')*10 + (us1.charAt(4)-'0');
			}
			else {
				num = (us1.charAt(0)-'0')*1000 + (us1.charAt(1)-'0')*100 + (us1.charAt(3)-'0')*10 + (us1.charAt(4)-'0');
				
				if(us1.charAt(6)=='P' && us1.charAt(7)=='M' )
					num += 1200;
				
			}
			
			System.out.println(num);
			
			int n;
			n = s.nextInt();
			s.nextLine();
			for(int j=0; j<n; j++)
			{
				int left = 0, right=0;
				us1=s.nextLine();
	
				if(us1.charAt(0)=='1' && us1.charAt(1)=='2' && us1.charAt(6)=='A' && us1.charAt(7)=='M' )
				{
					left=(us1.charAt(3)-'0')*10 + (us1.charAt(4)-'0');
				}
				else {
					left = (us1.charAt(0)-'0')*1000 + (us1.charAt(1)-'0')*100 + (us1.charAt(3)-'0')*10 + (us1.charAt(4)-'0');
					if(us1.charAt(6)=='P' && us1.charAt(7)=='M' )
						left += 1200;
					
				}
				

				if(us1.charAt(9)=='1' && us1.charAt(10)=='2' && us1.charAt(15)=='A' && us1.charAt(16)=='M' )
				{
					right=(us1.charAt(12)-'0')*10 + (us1.charAt(13)-'0');
				}
				else {
					right = (us1.charAt(9)-'0')*1000 + (us1.charAt(10)-'0')*100 + (us1.charAt(12)-'0')*10 + (us1.charAt(13)-'0');
					if(us1.charAt(15)=='P' && us1.charAt(16)=='M' )
						right += 1200;
					
				}
				
				if(left <= num && num <= right)
					System.out.print("1");
				else {
					System.out.print("0");
				}
				
			}
			
			System.out.println();
			
		}
			
	}
}


