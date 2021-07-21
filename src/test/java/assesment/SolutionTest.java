package assesment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	
	@Test
	public void singTest()  {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		
		Bird b = new Bird();
		b.sing();
		
		Assertions.assertEquals("I am singing", baos.toString().trim());
		baos.reset();
		Chicken c=new Chicken(Gender.Male);
		c.sing();
		Assertions.assertEquals("I am singing Cock a doodle doo", baos.toString().trim());
		c=new Chicken(Gender.Female);
		baos.reset();
		c.sing();
		Assertions.assertEquals("I am singing Cluck, cluck", baos.toString().trim());
		
		
	}
	
	@Test
	public void parrotTest() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		CanSay c=new ParrotLivingBy(LivingBy.CAT);
		Parrot p=new Parrot(c);
		p.say();
		Assertions.assertEquals("Me ow", baos.toString().trim());
		baos.reset();
		c=new ParrotLivingBy(LivingBy.DOG);
		new Parrot(c).say();
		Assertions.assertEquals("Woof, woof", baos.toString().trim());
		baos.reset();
		c=new ParrotLivingBy(LivingBy.ROOSTER);
		new Parrot(c).say();
		Assertions.assertEquals("Cock-a-doodle-doo", baos.toString().trim());
	}
}
