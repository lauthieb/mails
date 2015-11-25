package lille1.global;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InhabitantTest {
	protected Inhabitant inhabitant;
	
	@Before
	public void init() {
		this.inhabitant = new Inhabitant("Thibault", new City("Lille"));
	}
	
	@Test
	public void propertiesAreCorrectlyInitialized() {
		assertEquals("Thibault", this.inhabitant.getName());
		assertEquals("Lille", this.inhabitant.getCity().getName());
		assertEquals(5000, this.inhabitant.getBankAccount().getAmount());
	}
}
