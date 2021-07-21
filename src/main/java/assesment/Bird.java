package assesment;

public class Bird extends Animal {
	void fly () {
		System.out.println("I am flying");
	}
	
	public void sing() {
		System.out.println("I am singing"); // no test possible
	}
	
	void sing(String sound) {
		System.out.println("I am singing "+sound); 
	}

}
