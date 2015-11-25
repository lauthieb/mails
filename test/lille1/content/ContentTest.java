package lille1.content;

import org.junit.Before;
import org.junit.Test;

public abstract class ContentTest {
	@Before
	public abstract void createContent();
	
	@Test
	public abstract void contentIsCorrectlyInitialized();
	
	@Test
	public abstract void testToString();
	
}
