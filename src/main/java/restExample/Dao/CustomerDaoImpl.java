package restExample.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import restExample.Bean.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {

	
	
@Autowired
HibernateTemplate hibernateTemplate;

@Override
@Transactional(readOnly = false)
	public  int addCustomer(Customer cust) {
		int id=(Integer) hibernateTemplate.save(cust);
		return id;
	}
/*@Override
	public  Customer loadCustomer(int custid) {
		Customer c=hibernateTemplate.get(Customer.class, custid);
		return c;
	}*/
	/*
	public static void updateCustomer(Customer cust) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {

			session.update(cust);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}
*/
	public  boolean deletCustomer(int custid) {
		String hql = "DELETE from Customer WHERE cust_id = ?  ";	
		@SuppressWarnings("unchecked")
		List<Customer> cust= (List<Customer>) hibernateTemplate.find( hql,custid); 
		 
		return cust.size()>0?true:false;
	}





@Override
public List<Customer> getCustomer() {
	// TODO Auto-generated method stub
	String hql = "FROM Customer";
	@SuppressWarnings("unchecked")
	List<Customer> cust= (List<Customer>) hibernateTemplate.find( hql); 
	 
	return cust;
} 

}
