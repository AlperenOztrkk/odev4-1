package Adapters;



import Abstract.ICustomerCheckService;
import Entitiy.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		System.out.println("Geçerli Müşteri:");
		System.out.println("Tc: " + customer.getNationalityId() + " / "
			+ customer.getFirstName().toUpperCase() + " "
			+ customer.getLastName().toUpperCase() + " / Doğum yılı: "+ customer.getDateOfBirth() );
		System.out.println("-------");
		return true;
	}
}
