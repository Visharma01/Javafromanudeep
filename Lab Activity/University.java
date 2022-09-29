package com.mumuniversity.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	@Column(length = 20, nullable = false)
	private String uname;
	
	@Column(length = 20, nullable = false)
	private String ulocation;
	
	private String uemail;
	


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	private List<Student> student;
}
