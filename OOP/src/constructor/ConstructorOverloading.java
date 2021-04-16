package constructor;


class Vehicle1{
	 
	int wheels;
	String color;
	int headlight;
	
	Vehicle1(){
		
	}
	
	Vehicle1(int wheels){
		this.wheels=wheels;
		headlight=2;
	}
	
	Vehicle1(int wheels,String color){
		this.wheels=wheels;
		this.color=color;
		headlight=2;
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Vehicle1 car=new Vehicle1(4);
		Vehicle1 eRishkaw=new Vehicle1(3,"yellow");

		Vehicle1 toto=new Vehicle1(); // to use default constructor we must have to redefine it because it is overwritten 
		
		System.out.println(car.wheels+" wheels ");
		System.out.println(eRishkaw.wheels+" Wheels and "+eRishkaw.color+" color");
	}

}
