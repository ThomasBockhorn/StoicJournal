/**
 * 
 */
package com.thomasbockhorn.stoicjournal.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * @author thomasbockhorn
 *
 */
@Entity
public class JournalEntry implements Serializable{
	

	private static final long serialVersionUID = 7831921432039967074L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long entry_id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String content;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public JournalEntry() {
	}


	public JournalEntry(long entry_id, String title, String content, User user) {
		this.entry_id = entry_id;
		this.title = title;
		this.content = content;
		this.user = user;
	}


	public long getId() {
		return entry_id;
	}


	public String getTitle() {
		return title;
	}


	public String getContent() {
		return content;
	}


	public void setId(long entry_id) {
		this.entry_id = entry_id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setContent(String content) {
		this.content = content;
	}

	public void setId(Long entry_id) {
		this.entry_id = entry_id;
	}

}
