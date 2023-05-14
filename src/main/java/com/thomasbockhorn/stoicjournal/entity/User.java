/**
 * 
 */
package com.thomasbockhorn.stoicjournal.entity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

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
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	@Column
	private List<JournalEntry> journalEntries = new ArrayList<>();
	
	public User() {
	}

	public User(Long user_id, String firstName, String lastName, Long password, List<JournalEntry> journalEntries) {
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.journalEntries = journalEntries;
	}

	public Long getUser_id() {
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

	public List<JournalEntry> getJournalEntries() {
		return journalEntries;
	}

	public void setUser_id(Long user_id) {
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

	public void setJournalEntries(List<JournalEntry> journalEntries) {
		this.journalEntries = journalEntries;
	}

	public void addJournalEntry(JournalEntry journalEntry) {
		journalEntries.add(journalEntry);
		journalEntry.setUser(this);
	}
	
	public void removeEntry(JournalEntry journalEntry) {
		journalEntry.setUser(null);
		this.journalEntries.remove(journalEntry);
	}
	
}
