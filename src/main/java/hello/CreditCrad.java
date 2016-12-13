/**
 * 
 */
package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author salrosan  - Dec 13, 2016
 * 
 */
@Entity
public class CreditCrad {
	
	/**
	 * 
	 */
	public CreditCrad() {
		// TODO Auto-generated constructor stub
	}
	
	
	
    /**
	 *
	 * @param name
	 * @param type
	 * @param number
	 */
	public CreditCrad(String name, String type, Long number) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
	}



	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
	private String name;
	private String type;
	private Long number;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the number
	 */
	public Long getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(Long number) {
		this.number = number;
	}
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditCrad [id=").append(id).append(", name=").append(name).append(", type=").append(type).append(", number=").append(number)
				.append("]");
		return builder.toString();
	}

	
	
	

}
