/**
 * 
 */
  package hello;

    import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service
    public class CustomerService {
        @Autowired
        private CustomerRepository customerRepository;
        
        @Autowired
        private AddressRepository addressRepository;

        @Transactional
        public void store(){
            Address address1 = new Address("07093", "Brooklyn", "129 67th st", null, "USA");
            Address address2 = new Address("03333", "Qeeens", "333 67th st", null, "USA");
            //addressRepository.save(address1);
            //addressRepository.save(address2);
                                    
            // save a couple of customers
            Customer jack = new Customer("Jack", "Bauer");
            
            Email email = new Email();
            email.setValue("suleiman@gmail.com");

            jack.setEmail(email);
            jack.setHomeAddress(address1);

            customerRepository.save(jack);                  
            customerRepository.save(new Customer("Chloe", "O'Brian", address1));
            
            
            
            Customer a = new Customer("aaa", "O'Brian", address1);

            a.getCrads().add(new CreditCrad("TD", "MasterCard", 1232342354L));
			
			customerRepository.save(a);
                        
        }
    }