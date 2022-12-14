package BankingProject.domain;/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */


public class TestBanking3 {

  public static void main(String[] args) {
    Bank     bank = new Bank();

    bank.addCustomer("Jane","Simms");
    // Add Customer Jane, Simms
	//code
      bank.addCustomer("Owen","Bryant");
    //Add Customer Owen, Bryant
	//code
      bank.addCustomer("Tim","Solev");
    // Add Customer Tim, Soley
	//code
      bank.addCustomer("Maria","Solev");
    // Add Customer Maria, Soley
	//code
    for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
      Customer customer = bank.getCustomer(i);

      System.out.println("Customer [" + (i+1) + "] is "
			 + customer.getLastName()
			 + ", " + customer.getFirstName());
    }
  }
}
