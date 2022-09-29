package com.mumuniversity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student {

	@Id
	private int sid;
	
	@Column(length = 20, nullable = false)
	private String sname;
	
	@Column(length = 10)
	private String sclass;
	
	private String gender;
	
	@Column(length = 12, nullable = false, unique = true)
	private int sphone;
	
	@Column(length = 10, nullable = false)
	private String sstream;
	
	@Column(length = 50)
	private String addr;
}
