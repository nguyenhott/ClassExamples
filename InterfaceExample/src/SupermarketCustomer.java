public class SupermarketCustomer implements ICustomer{

    String customerAccount;
    String customerName;
    public void createAccount(String account, String name){
        customerAccount = account;
        customerName = name;
        //different implementation: do not print out the customer account
    }

    public void display(){
        //different implementation
        System.out.println("Supermarket customer of the account " + customerAccount + " has name " + customerName);
    }
}