/**
 * 
 */
package com.thomasbockhorn.stoicjournal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thomasbockhorn.stoicjournal.JournalEntryService.JournalEntryService;
import com.thomasbockhorn.stoicjournal.entries.JournalEntry;

/**
 * @author thomasbockhorn
 *
 */
@RestController
@RequestMapping("api/v1/journal")
public class JournalController {

	@Autowired
	private JournalEntryService journalEntryService;
	
	@PostMapping
	public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry journalEntry){
		JournalEntry savedEntry = journalEntryService.createEntry(journalEntry);
		return new ResponseEntity<>(savedEntry, HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<JournalEntry> getUserById(@PathVariable("id") Long entryId){
		JournalEntry journalEntry = journalEntryService.getJournalEntryById(entryId);
		return new ResponseEntity<>(journalEntry, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<JournalEntry>> getAllEntries(){
		List<JournalEntry> journalEntries = journalEntryService.getAllEntries();
		return new ResponseEntity<>(journalEntries, HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<JournalEntry> updateEntry(@PathVariable("id") Long entryId, @RequestBody JournalEntry journalEntry){
		journalEntry.setId(entryId);
		JournalEntry updateEntry = journalEntryService.updateEntry(journalEntry);
		return new ResponseEntity<>(updateEntry, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEntry(@PathVariable("id") Long entryId){
		journalEntryService.deleteEntry(entryId);
		return new ResponseEntity<>("Entry was successfuly deleted", HttpStatus.OK);
	}
}
