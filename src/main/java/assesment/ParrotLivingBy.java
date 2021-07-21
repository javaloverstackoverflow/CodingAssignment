package assesment;

public class ParrotLivingBy implements CanSay{
private LivingBy livingBy;
	@Override
	public String say() {
		// TODO Auto-generated method stub
		if(livingBy==LivingBy.CAT) {
			return "Me ow";
		}else if(livingBy==LivingBy.ROOSTER) {
			return "Cock-a-doodle-doo";
			
		}else {
			return "Woof, woof";
		}
		
	}
public ParrotLivingBy(LivingBy livingBy) {
	this.livingBy=livingBy;
}
}
