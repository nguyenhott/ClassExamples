/*
* Customer is the superclass
* */
class Customer{

	protected String customerName;
	
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


