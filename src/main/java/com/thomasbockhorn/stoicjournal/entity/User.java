/**
 * 
 */
package com.thomasbockhorn.stoicjournal.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * @author thomasbockhorn
 *
 */
@Entity
public class User implements Serializable{
	

	private static final long serialVersionUID = -5662508195140209025L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private Long password;
	
	@OneToMany(mappedBy = "user", cascade = {CascadeType.ALL})
	private List<JournalEntry> journalEntry = new ArrayList<>();
	
	public User() {
	}

	public User(Long user_id, String firstName, String lastName, Long password, List<JournalEntry> journalEntry) {
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.journalEntry = journalEntry;
	}

	public Long getId() {
		return user_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getPassword() {
		return password;
	}

	public void setId(Long user_id) {
		this.user_id = user_id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

	public List<JournalEntry> getJournalEntry() {
		return journalEntry;
	}

	public void setJournalEntry(List<JournalEntry> journalEntry) {
		this.journalEntry = journalEntry;
	}
	
	
	
	
	
	
}
