package com.example.springadminlte3;

import com.example.springadminlte3.models.Customer;
import com.example.springadminlte3.models.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@PostConstruct
//	public void loadCustomers() {
//		CustomerRepository repository = new CustomerRepository();
//
//		repository.save(new Customer("Jack", "Bauer"));
//		repository.save(new Customer("Chloe", "O'Brian"));
//		repository.save(new Customer("Kim", "Bauer"));
//		repository.save(new Customer("David", "Palmer"));
//		repository.save(new Customer("Michelle", "Dessler"));
//
//		// fetch all customers
//		log.info("Customers found with findAll():");
//		log.info("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			log.info(customer.toString());
//		}
//		log.info("");
//
//		// fetch an individual customer by ID
//		Customer customer = repository.findById(1L);
//		log.info("Customer found with findById(1L):");
//		log.info("--------------------------------");
//		log.info(customer.toString());
//		log.info("");
//
//		// fetch customers by last name
//		log.info("Customer found with findByLastName('Bauer'):");
//		log.info("--------------------------------------------");
//		repository.findByLastName("Bauer").forEach(bauer -> {
//			log.info(bauer.toString());
//		});
//		// for (Customer bauer : repository.findByLastName("Bauer")) {
//		//  log.info(bauer.toString());
//		// }
//		log.info("");
//	}
}
