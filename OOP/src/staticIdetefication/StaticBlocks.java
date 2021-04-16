package staticIdetefication;

public class StaticBlocks {

	static {
		System.out.println("static 1");
	}
	
	static {
		System.out.println("static 2");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Function");

	}
	
	static {
		System.out.println("static 3");
	}

}
