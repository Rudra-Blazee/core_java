package Basic;

//class cat {
//	String color,breed;
//	int legs , eyes;
//	
//	public void walk() {
//		System.out.println("Cat is Walking");
//	}
//	
//	public void eat() {
//		System.out.println("Cat is eating");
//	}
//	
//	public void discription() {
//		System.out.println("My cat has "+legs+" legs and "+eyes+" eyes");
//	}
//	
//}

class dog {
	String name,breed;
	
	public void jump() {
		System.out.println("My dog "+name+" jumped");
	}
	
	public void discription() {
		System.out.println("My dog's name is "+name+" and its breed is "+breed);
	}
}



public class MainClass {
	
	public static void main(String[] args) {
		
//		cat cat1=new cat();
//		cat cat2=new cat();
		
//		cat1.walk();
//		cat2.eat();
		
//		cat1.eyes=2;
//		cat1.legs=4;
//		
//		cat2.eyes=3;
//		cat2.legs=5;
//		
//		cat1.discription();
//		cat2.discription();
		
		dog dog1=new dog();
		dog dog2=new dog();
		
		dog1.name="tommy";
		dog1.breed="husky";
		
		dog2.name="choppy";
		dog2.breed="poodle";
		
		dog1.jump();
		dog2.jump();
		
		dog1.discription();
		dog2.discription();
		
		
		
		
		
		
	}

}
