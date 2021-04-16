package constructor;

class Vehicle {
	int wheels;
	Vehicle() {
		wheels =4;
	}
}
class Constructor{
Constructor(){
	System.out.println("Constructor Is Created");
} 
}
public class MyConstructor {

//	MyConstructor(){
//		System.out.println("Constructor Is Created");
//	} 
	
	public static void main(String[] args) {
		
//		MyConstructor obj=new MyConstructor();
		
		Constructor obj=new Constructor();
		
		Vehicle car=new Vehicle();
		Vehicle car2=new Vehicle();
		System.out.println(car.wheels +" Wheels");
		
		System.out.println(car2.wheels +" Wheels");
	}

}
