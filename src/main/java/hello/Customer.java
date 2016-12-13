// tag::sample[]
package hello;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    
    @Embedded
    private Email email;
    
    
    @OneToMany(orphanRemoval=true, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="CUST_ID") // join column is in table for Order
    private Set<CreditCrad> crads = new HashSet<>();
    
	@ManyToOne(cascade=CascadeType.ALL)
    private Address homeAddress;

    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    

   

public Customer(String firstName, String lastName, Address homeAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
	}

// end::sample[]


	public Long getId() {
		return id;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", firstName=").append(firstName).append(", lastName=").append(lastName).append(", email=")
				.append(email).append(", crads=").append(crads).append(", homeAddress=").append(homeAddress).append("]");
		return builder.toString();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}

	/**
	 * @return the crads
	 */
	public Set<CreditCrad> getCrads() {
		return crads;
	}

	/**
	 * @param crads the crads to set
	 */
	public void setCrads(Set<CreditCrad> crads) {
		this.crads = crads;
	}


	
	
}

