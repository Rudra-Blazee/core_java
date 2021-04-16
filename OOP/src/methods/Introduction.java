package methods;

public class Introduction {
	
	public static void main(String[] args) {
	
		double firstNumber=5.544;
		double secondNumber=5.544;
		
		double one=54;
		double two=65;
		
		double result=maxOf(firstNumber,secondNumber);
		double result2=maxOf(one,two);
		
		sayHi();
		System.out.println(result);
		sayHi();
		System.out.println(result2);
		sayHi();
	}

		static double  maxOf(double a,double b) {
			if(a<b) {
				return a;
			}
			else {
				return b;
			}
		}
		
		static void sayHi() {
			System.out.println("Hii");
			System.out.println("Good Morning");
		}

}
