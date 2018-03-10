package restExample.Services;

import java.util.List;

import restExample.Bean.Customer;
public interface customerOperations {
	
	int addCustomer(Customer e);
	public List<Customer> getCustomer();

	public boolean deleteCustomer(int id);

	//public void updateExistingEmployee(Employee e) throws EmployeeNotFoundException;

	/*public Customer displayCustomers(int id);
*/
	/*public void displayAllEmployeesInfo();*/

}
