package encapsulation;

public class EncsaptulationIntroduction {

	public static void main(String[] args) {
		
		Student obj=new Student();
		
		obj.setAge(20);
		obj.setName("Sumit");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}
