class Customer{

	//protected String accountId;
	protected String customerName;
	//protected int customerAge;
	
	/*void createAccount(String accountId, String name){
		System.out.println("Account created for " + name + " with ID " + accountId);
	}*/

	public Customer(String name){
		customerName = name;
	}

	protected void displayName(){
		System.out.println("Hello " + customerName);
	}

	/*public static void main(String[] args){
		Customer c = new Customer();
		c.displayName("Nguyen");
	}*/

}


