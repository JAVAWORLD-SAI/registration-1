package com.example.Model;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Registration")
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sno;
	private String sname;
	private int Smobile;
	private String Saddress;
	private String SCollege;

	

}
