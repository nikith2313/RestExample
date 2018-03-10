package restExample.CustomerResource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restExample.Bean.Customer;
import restExample.Services.customerOperations;

@RestController
public class CustomerResource {

	@Autowired
	customerOperations co;
	
@RequestMapping(path="/hello",method=RequestMethod.GET)
	public String hello(){
	return "hello nikki"; 
}
@PostMapping(value="addCustomer")
public boolean addCustomer(@RequestBody Customer customer){

	int cust=co.addCustomer(customer);
	return cust>0?true:false; 
}

@GetMapping(value="showall")
public List<Customer> showCustomers(){

	List<Customer> cust=co.getCustomer();
	return cust; 
}

@PostMapping(value="deleteCustomer")
public boolean deleteCustomers(@PathVariable int id){

	boolean cust=co.deleteCustomer(id);
	return cust; 
}

}
