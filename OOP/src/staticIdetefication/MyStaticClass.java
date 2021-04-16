package staticIdetefication;


import staticIdetefication.A.B;
import staticIdetefication.A.C;

public class MyStaticClass {

	public static void main(String[] args) {
	
		A objA=new A();
		
		B objB=objA.new B();
		
		C objC=new A.C();
		
	}

}
