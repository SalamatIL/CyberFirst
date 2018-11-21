
public class bankAccount {

	private long accNumber;
	private double balance;
	private String custName;
	private String email;
	private String phoneNum;
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public double depositFunds (double deposit) {
		return deposit+this.balance;
	}
	public double withdrawall (double withdraw) {
		if (this.balance-withdraw<0) {
			System.out.println("Only "+this.balance+"Withdrawal is not processed");
			
		} else {
			this.balance=this.balance-withdraw;
			System.out.println("remaining balance is "+this.balance+"Withdrawal is processed");
		}
		return this.balance;
	}

}
