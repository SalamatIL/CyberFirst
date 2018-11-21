
public class encapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car porsche = new Car();
		porsche.setModel("911");
		//porsche.getModel(); //We don't see any output. To see we need to print it out
		String model = porsche.getModel();
		System.out.println(model);
		
		bankAccount mikeAccount = new bankAccount();
		mikeAccount.setAccNumber(546546545);
		mikeAccount.setBalance(4587.55);
		mikeAccount.setCustName("Mike");
		
		mikeAccount.withdrawall(1000);
		System.out.println(mikeAccount.depositFunds(100));
		System.out.println(mikeAccount.getCustName());
		
	}

}
