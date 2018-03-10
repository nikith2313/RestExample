package restExample.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restExample.Bean.Customer;
import restExample.Dao.CustomerDao;

@Service
public class CustomerOperationImple implements customerOperations {

	@Autowired
	private CustomerDao ed;


	@Override
	public int addCustomer(Customer e) {
		// TODO Auto-generated method stub
	int id=	 ed.addCustomer(e);
	return id;
	}


	@Override
	public  List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		List<Customer> cust=ed.getCustomer();
return cust;
	}

/*
	@Override
	public Customer displayCustomers(int id) {
		// TODO Auto-generated method stub
		Customer b = ed.loadCustomer(id);
		return b;		
	}
		*/

	
	

	public boolean deleteCustomer(int id)  {

		boolean b = ed.deletCustomer(id);
return b;
	}

	/*public void updateExistingCustomer(Customer e) throws , InvalidSalaryException {
		
	}*/

/*	public Customer displayCustomers(int id) {

		Customer b = ed.loadCustomer(id);
		return b;
	}*/
	/*
	public void displayAllCustomersInfo() {

		List<Customer> b = ed.DisplayAllCustomer();

	}

	public void highestSalary(int salary) {
		// TODO Auto-generated method stub
		ArrayList<Customer> emp = ed.calculateHighSalary(salary);
	}
*/




	}
