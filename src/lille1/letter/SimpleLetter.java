package lille1.letter;

import lille1.content.TextContent;
import lille1.global.Inhabitant;

public class SimpleLetter extends Letter<TextContent> {
	
	public SimpleLetter(String content, Inhabitant sender, Inhabitant receiver){
		super(new TextContent(content), sender, receiver);
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
