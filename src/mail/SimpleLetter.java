package mail;

public class SimpleLetter extends Letter<TextContent> {
	protected final int COST_SIMPLE_LETTER = 1;
	
	public SimpleLetter(String content) {
		this.content = new TextContent(content);
	}
	
	public TextContent getContent() {
		return this.content;
	}

	@Override
	public double getCost() {
		return COST_SIMPLE_LETTER;
	}

	@Override
	public void doAction() {
		
	}
	
	@Override
	public String toString() {
		return "simple letter whose content is a " + this.content;
		
	}
}
