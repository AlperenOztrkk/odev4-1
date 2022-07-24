package Abstract;

import Entitiy.Customer;

public abstract class BaseCustomerManager implements ICostumerService  {
  
	public void save(Customer customer) {
		System.out.println("Saved to database: " + customer.getFirstName());
	}
}
