package TheLeadGame;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            String s = sc.nextLine();

            int sum = 0, ans = -1;

            for(int j=0; j<n; j++)
            {
                if(s.charAt(i) == '1')
                    sum++;
                else
                    sum--;

                ans = Math.max(ans, Math.abs(sum));
                
            }

            System.out.println(ans);
        }
			
        sc.close();
	}

}
