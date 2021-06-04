package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "candidates")
@Data
public class Candidates extends User {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private int id;

		
		@Column(name = "first_name")
		private String firstName;
		
		
		@Column(name = "last_name")
		private String lastName;

		
		@Column(name = "national_identity")
		private String nationalIdentity;
		
		
		@Column(name = "birth_of_date")
		private String birthOfDate;
	

}
