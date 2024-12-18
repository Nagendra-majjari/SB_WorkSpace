package in.nagendra.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer uid;
	private String name;
	private String email;
	private Long phno;
	
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate createdAt;
	
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDate updatedAt;

}
