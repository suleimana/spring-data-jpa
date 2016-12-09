package hello;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String postalCode;
	private String city;
	private String line1;
	private String line2;
	private String country;
	
	@OneToMany(mappedBy = "homeAddress", fetch = FetchType.LAZY)
	private Set<Customer> customers;


	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String postalCode, String city, String line1, String line2, String country) {
		super();
		this.postalCode = postalCode;
		this.city = city;
		this.line1 = line1;
		this.line2 = line2;
		this.country = country;
	}



	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", postalCode=" + postalCode + ", city=" + city + ", line1=" + line1 + ", line2="
				+ line2 + ", country=" + country + "]";
	}

}
