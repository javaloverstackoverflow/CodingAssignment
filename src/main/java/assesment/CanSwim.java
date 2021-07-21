package assesment;

public interface CanSwim {

	default void swim() {
		System.out.println("I am swiming");
	}
}
