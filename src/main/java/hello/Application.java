package hello;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Autowired
	CustomerService  customerService;

	@Transactional
	@Bean
	public CommandLineRunner demo(CustomerRepository repository, AddressRepository addressRepository) {
		return (args) -> {
			customerService.store();
			
			

/*			Address address1 = new Address("07093", "Brooklyn", "129 67th st", null, "USA");
			Address address2 = new Address("03333", "Qeeens", "333 67th st", null, "USA");
			addressRepository.save(address1);
			addressRepository.save(address2);
			
			// save a couple of customers
			Customer jack = new Customer("Jack", "Bauer");
			
			jack.setHomeAddress(address1);
			repository.save(jack);					
			repository.save(new Customer("Chloe", "O'Brian",address1));
						
			repository.save(new Customer("Kim", "Bauer",address2));
			
			address1.setCity("North Bergun");
			
			addressRepository.save(address1);
			*/
			
			
			
//			repository.save(new Customer("David", "Palmer", address1));
//			repository.save(new Customer("Michelle", "Dessler",address2));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (Customer bauer : repository.findByLastName("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");

			// fetch customers by home address
			log.info("Customer found with ByHomeAddress(address):");
/*			log.info("--------------------------------------------");
			for (Customer bauer : repository.findByHomeAddress(address1)) {
				log.info(bauer.toString());
			}
			log.info("");*/

		};
	}

}
