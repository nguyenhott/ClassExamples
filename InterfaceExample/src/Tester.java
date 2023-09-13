public class Tester{


	public static void main(String[] args){
		BankCustomer c = new BankCustomer();
		c.createAccount("1111", "Emily");
		c.deposit(5000);
		c.display();

		SupermarketCustomer sc = new SupermarketCustomer();
		sc.createAccount("2222", "John");
		sc.display();
	}

}




