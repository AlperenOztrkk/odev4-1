package CoffieShop;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entitiy.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setDateOfBirth("18/08/1997");
		customer.setFirstName("Alperen");
		customer.setLastName("Öztürk");
		customer.setNationalityId("2255225");
		if(customer.getFirstName() != null || customer.getLastName() !=null ) {
			System.out.println("Geçerli işlem");
			
		}
		else {
			System.out.println("Geçersiz işlem");
		}
		
		BaseCustomerManager customerManager= new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
	}
	
	}


