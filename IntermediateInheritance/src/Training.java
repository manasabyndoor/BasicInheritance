//Training class-Base class
abstract public class Training {

	private int id;
	protected String subject;
	private int fees;

	public Training(int id, String subject, int fees) {
		super();
		this.id = id;
		this.subject = subject;
		this.fees = fees;

	}

	public int getFees() {
		return fees;
	}

	abstract public void getOrderValue();

	abstract public int getCost();

}
