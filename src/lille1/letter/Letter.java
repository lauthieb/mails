package lille1.letter;

import lille1.content.Content;
import lille1.global.Inhabitant;

public abstract class Letter<C extends Content> {
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected final int COST_LETTER = 1;
	
	public Letter(C content, Inhabitant sender, Inhabitant receiver){
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public abstract double getCost();
	public abstract void doAction();

	public C getContent() {
		return content;
	}
	public Inhabitant getSender() {
		return sender;
	}
	public Inhabitant getReceiver() {
		return receiver;
	}
	
	@Override
	public String toString() {
		return ""+this.content;
	}
	
	
}
