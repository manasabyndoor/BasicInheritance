//Derived class
public class PublicTraining extends Training {
	int participants1;
	private int cost;

	public PublicTraining(int id, String subject, int fees, int partcipants1) {
		super(id, subject, fees);
		this.participants1 = partcipants1;

	}
	
	//calculates fees
	public void getOrderValue() {
		this.cost = getFees() * participants1;

	}
	//returns cost
	public int getCost() {
		return cost;
	}

}
