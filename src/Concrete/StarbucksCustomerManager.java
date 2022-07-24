package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entitiy.Customer;

public class StarbucksCustomerManager  extends BaseCustomerManager {

ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Gerçek kişi?");
		}
		
	}
}
