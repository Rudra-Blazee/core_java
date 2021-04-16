package constructor;

	class vehicle{
		
		int wheels;
		int headlights;
		
		vehicle(int wheels){
			this.wheels=wheels;
			headlights=2;
		}
	}



public class ParametrizedConstructor {

	public static void main(String[] args ) {
		
		vehicle car=new vehicle(4);
		vehicle scooty=new vehicle(2);
		
		System.out.println(car.wheels+" Wheels "+car.headlights+" Headlights");
		System.out.println(scooty.wheels+" Wheels "+scooty.headlights+" Headlights");
	}
}
