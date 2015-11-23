package mail;

public abstract class Letter<C extends Content> {
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected final int COST_LETTER = 1;
	
	public abstract double getCost();
	public abstract void doAction();
	//TODO: Se servir du pattern d'avant
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
