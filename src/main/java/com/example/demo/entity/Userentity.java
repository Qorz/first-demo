package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the userentity database table.
 * 
 */
@Entity
@NamedQuery(name="Userentity.findAll", query="SELECT u FROM Userentity u")
public class Userentity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private String password;

	public Userentity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}