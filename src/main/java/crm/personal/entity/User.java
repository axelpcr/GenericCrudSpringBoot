package crm.personal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Created by axel on 16/10/16.
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "first_name")
	private String firstName;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
