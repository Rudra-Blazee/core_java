package Output;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		System.out.println("inputArray");
		s.nextLine();
		
		char inputArray[][] = new char[t][t];

		for (int i = 0; i < t; i++)
		{ 
		    for (int j = 0; j < t; j++)
		    { 
		        inputArray[i][j] = s.next().charAt(0);
		    } 
		}
		
		int a=s.nextInt();
		int b=s.nextInt();
		a=a-1;
		b=b-1;
		System.out.println(inputArray[a][b]);
		
		
		
		
		
		
	}

}
