package assesment;

public class Chicken extends Bird {
	private Gender gender; //should be an enum
	public Chicken(Gender gender) {
		this.gender = gender;
	}
	public void sing() {
		if (gender== Gender.Male) {
			super.sing("Cock a doodle doo"); 
		} else {
			super.sing("Cluck, cluck"); 
		}
		
	}
	void fly() {
		
	}
}