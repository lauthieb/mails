package lille1.global;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	protected Inhabitant inhabitant;
	protected BankAccount bank;
	
	@Before
	public void init() {
		this.inhabitant = new Inhabitant("Laurent", new City("Lille"));
		this.bank = new BankAccount(5000, this.inhabitant);
	}
	
	@Test
	public void propertiesAreCorrectlyInitialized() {
		assertEquals(5000, this.bank.getAmount());
		assertEquals(inhabitant, this.bank.getOwner());
	}
	
	@Test
	public void creditOneHundred() {
		assertEquals(5000, this.bank.getAmount());
		this.bank.credit(100);
		assertEquals(5100, this.bank.getAmount());
	}
	
	@Test
	public void debitOneHundred() {
		assertEquals(5000, this.bank.getAmount());
		this.bank.debit(100);
		assertEquals(4900, this.bank.getAmount());
	}
}
