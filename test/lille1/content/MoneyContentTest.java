package lille1.content;

import static org.junit.Assert.*;

public class MoneyContentTest extends ContentTest{

	protected MoneyContent content;
	protected int amount;
	
	@Override
	public void createContent() {
		this.amount = 10;
		this.content = new MoneyContent(this.amount);	
	}
	
	@Override
	public void contentIsCorrectlyInitialized() {
		assertEquals(this.amount, this.content.getAmount());
	}

	@Override
	public void testToString() {
		assertEquals("a money content (10)", this.content.toString());
	}

}
