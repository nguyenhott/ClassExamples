class BankCustomer implements ICustomer{

	String customerAccount;
	String customerName;
	double customerBalance;

	public void createAccount(String account, String name){
		customerAccount = account;
		customerName = name;
		customerBalance = 0;
		System.out.println("Create account for " + name + " with ID: " + account);
	}

	public void deposit(double deposit){
		customerBalance = deposit;
	}

	public void display(){
		System.out.println("Bank account " + customerAccount + " has the balance " + customerBalance);
	}
}


