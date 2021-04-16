package methods;

public class PassByValue {

	public static void main(String[] args) {
//  1=>	
		int c=34;
		int d=12;
		
		System.out.println(c+" "+d);
		swap(c,d);
		System.out.println(c+" "+d);

	}

//	
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
}

	
//	2=> 
//	public static void main(String[] args) {
//		Num num1= new Num();
//		Num num2= new Num();
//		
//		num1.val=65;
//		num2.val=44;
//		
//		Val(num1,num2);
//		System.out.println(num1.val+" "+num2.val);
//	}	
//	
//		static void Val(Num a,Num b) {
//		int c=a.val;
//		a.val=b.val;
//		b.val=c;
//		}	
//  }
//	class Num {
//		int val;
//
//	}
	
//	3=>
//	public static void main(String[] args) {
//		
//		Num a=new Num();
//		a.val=4;
//		
//		int num=changeVal(a);
//		System.out.println(a.val+" "+num);
//		
//		
//	}
//	
//	static int changeVal(Num num) {
//		Num b=num;
//		num.val++;
//		Num c=new Num();
//		c=num;
//		c.val++;
//		return b.val;
//	}
//	
//}
//class Num {
//	int val;
//
//}
	


