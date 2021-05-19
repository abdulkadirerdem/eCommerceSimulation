package eCommerceSimulation;

import eCommerceSimulation.business.concretes.CustomerManager;
import eCommerceSimulation.core.concretes.EmailValidatorManager;
import eCommerceSimulation.core.concretes.GoogleAdapter;
import eCommerceSimulation.dataAccess.concretes.HibernateCustomerDao;
import eCommerceSimulation.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Abdulkadir");
		customer.setLastName("Erdem");
		customer.setEmail("akadir_1256@hotmail.com");
		customer.setPassword("159753");

		CustomerManager customerManager = new CustomerManager(new EmailValidatorManager(), new HibernateCustomerDao(),
				new GoogleAdapter());

		customerManager.register(customer);
		customerManager.registerWithGoogle(customer);
		customerManager.login(customer);

	}

}
