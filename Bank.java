package corejava;

public class Bank {
	Sting bankName;
	String branch;
	int code;
	String address;
	
	public void cashDeposit() {
		System.out.println("deposit");
	}
	public void cashWithdraw() {
		System.out.println("cash withdrawl");
	}
	public void loan() {
		System.out.println("provide loan");
	}
	public void provideCheque() {
		System.out.println("provides cheque");
	}
}
