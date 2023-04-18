/**
 * 
 */
package com.thomasbockhorn.stoicjournal.entries;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author thomasbockhorn
 *
 */
@Entity
public class JournalEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String content;
	
	
	public JournalEntry() {
	}


	public JournalEntry(long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getContent() {
		return content;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
	
	
	
	

}
