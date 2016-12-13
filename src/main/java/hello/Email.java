/**
 * 
 */
package hello;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * @author salrosan  - Dec 13, 2016
 * 
 */
@Embeddable
public class Email {
	
	
	private String value;
	private Boolean isPrimary;
	
	
	/**
	 * 
	 */
	public Email() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param value
	 * @param isPrimary
	 */
	public Email(String value, Boolean isPrimary) {
		super();
		this.value = value;
		this.isPrimary = isPrimary;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the isPrimary
	 */
	public Boolean getIsPrimary() {
		return isPrimary;
	}
	/**
	 * @param isPrimary the isPrimary to set
	 */
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Email [value=").append(value).append(", isPrimary=").append(isPrimary).append("]");
		return builder.toString();
	}

	
	

}
