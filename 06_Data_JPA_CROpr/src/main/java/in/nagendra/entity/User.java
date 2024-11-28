package in.nagendra.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User_Data")   //optional
public class User {

	@Id
	@Column(name = "User_id")    //optional
	private Integer id;
	private String name;
	private String gender;
	private String country;

//	private LocalDate localdate;

	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate createdate;
//	private UpdateDate local;

	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDate updatedate;

}
