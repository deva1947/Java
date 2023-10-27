package ATM;

public class AccountHolder {
	  	private String userId;
	    private String pin;

	    public AccountHolder(String userId, String pin) {
	        this.userId = userId;
	        this.pin = pin;
	    }

	    public String getUserId() {
	        return userId;
	    }

	    public String getPin() {
	        return pin;
	    }

		@Override
		public String toString() {
			return "AccountHolder [userId=" + userId + ", pin=" + pin + "]";
		}
	    
}
