package lille1.letter;

import lille1.content.TextContent;

public class SimpleLetter extends Letter<TextContent> {
	
	public SimpleLetter(String content) {
		this.content = new TextContent(content);
	}
	
	public TextContent getContent() {
		return this.content;
	}

	@Override
	public double getCost() {
		return COST_LETTER;
	}

	@Override
	public void doAction() {
		
	}
	
	@Override
	public String toString() {
		return "simple letter whose content is a " + this.content;
		
	}
}
