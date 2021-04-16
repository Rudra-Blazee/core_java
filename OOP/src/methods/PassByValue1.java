package methods;

public class PassByValue1 {
	public static void main(String [] args) {
		
		ch a=new ch();
		ch b=new ch();
		
		a.val=42;
		b.val=87;
		
		System.out.println(a.val+" "+b.val);
		
		swap1(a,b);
		
		System.out.println(a.val+" "+b.val);
		
		
	}
	
	static void swap1(ch c,ch d) {
		int e=c.val;
		c.val=d.val;
		d.val=e;
	
	}	
	
	
}
class ch{
	int val;
}


