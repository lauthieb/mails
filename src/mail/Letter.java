package mail;

public abstract class Letter<C extends Content> {
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
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
	
	
}
