/*
* Use extends keyword to inherit from superclass
* */
public class SupermarketCustomer extends Customer{
	private String purchase;

	public SupermarketCustomer(String name, String boughtItems){
		super(name);
		purchase = boughtItems;
	}

	void displayPurchase(){
		System.out.println("Customer " + customerName + " bought "  + purchase);
	}	

	public static void main(String[] args){
	
		SupermarketCustomer c = new SupermarketCustomer("Emily", "milk");
		c.displayName();
		c.displayPurchase();
	}
}
