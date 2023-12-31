package ATM;

public class BankTransaction {
	private String description;
    private double amount;

    public BankTransaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

	@Override
	public String toString() {
		return "BankTransaction [description=" + description + ", amount=" + amount + "]";
	}
    
}

