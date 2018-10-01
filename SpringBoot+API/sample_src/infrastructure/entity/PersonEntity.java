package vn.fujinet.sample.infrastructure.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "PERSON")
public class PersonEntity {
	@Id
	public String id;
	
	public String firstName;
	
	public String lastName;
	
	public String dob;
	
	public String address;
}
