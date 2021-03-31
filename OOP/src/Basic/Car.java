package Basic;

public class Car {
	int maxSpeed = 100;
	int minSpeed = 0 ;
	double weight = 4079 ;
	boolean isTheCarOn= false ;
	char condition = 'A';
	
	public void printVariable() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
	}

	public void upgrade() {
		minSpeed = maxSpeed;
		maxSpeed += 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car familyCar = new Car();
		System.out.println("This is family Car : ");
		familyCar.printVariable();
		Car sumitCar = familyCar;
		familyCar.upgrade();
		System.out.println("This is Sumit Car : ");
		sumitCar.printVariable();
	}

}
