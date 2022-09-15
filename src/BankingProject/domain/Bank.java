package BankingProject.domain;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[1024];
        numberOfCustomer = 0;
    }

    public void addCustomer(String f,String l){
        Customer newCustomer = new Customer(f,l);
        customers[numberOfCustomer++] = newCustomer;
    }
    public int getNumOfCustomers(){
        return numberOfCustomer;
    }
    public Customer getCustomer(int index){
        return customers[index];
    }
}
