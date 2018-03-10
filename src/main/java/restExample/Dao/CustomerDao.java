package restExample.Dao;

import java.util.List;

import restExample.Bean.Customer;
public interface CustomerDao {

	public  int addCustomer(Customer cust);
	public  List<Customer> getCustomer();
	public  boolean deletCustomer(int custid);
	/*public  Customer loadCustomer(int cust);*/
}
