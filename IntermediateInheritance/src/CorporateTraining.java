//derived class
public class CorporateTraining extends Training {
	private int cost;
	private int days;

	public CorporateTraining(int id, String subject, int fees, int days) {
		super(id, subject, fees);
		this.days = days;
	}
	//calculates cost
	public void getOrderValue() {
		this.cost = getFees() * days;

	}
	//returns cost
	public int getCost() {
		return cost;
	}

}
