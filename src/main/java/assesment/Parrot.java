package assesment;

public class Parrot extends Bird {

	private CanSay livingBy;
	
	public Parrot(CanSay canSay) {
		this.livingBy = canSay;
	}
	
	public void say() {
		System.out.print(this.livingBy.say());
	}
}
