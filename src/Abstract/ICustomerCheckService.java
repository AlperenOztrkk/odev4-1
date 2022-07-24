package Abstract;

import Entitiy.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
