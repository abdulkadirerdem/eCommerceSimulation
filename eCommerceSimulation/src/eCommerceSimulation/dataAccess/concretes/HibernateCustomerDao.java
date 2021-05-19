package eCommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSimulation.dataAccess.abstracts.CustomerDao;
import eCommerceSimulation.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println(

				"Kullan�c� ba�ar�l� bir �ekilde eklendi: " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void remove(Customer customer) {
		System.out.println(
				"Kullan�c� ba�ar�l� bir �ekilde silindi: " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� ba�ar�l� bir �ekilde g�ncellendi: " + customer.getFirstName() + " "
				+ customer.getLastName());

	}

	@Override
	public List<Customer> getAll() {
		return customers;
	}

	@Override
	public Customer getById(int id) {

		for (Customer customer : customers) {
			if (customer.getId() == id)
				return customer;
		}

		return null;
	}

}
