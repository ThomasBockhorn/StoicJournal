/**
 * 
 */
package com.thomasbockhorn.stoicjournal.EntryService;

import java.util.List;

import com.thomasbockhorn.stoicjournal.entity.JournalEntry;

/**
 * @author thomasbockhorn
 *
 */
public interface EntryService {
	
	JournalEntry createEntry(JournalEntry journalEntry);
	
	JournalEntry getEntryById(Long journalEntry);
	
	List<JournalEntry> getAllEntries();
	
	JournalEntry updateEntry(JournalEntry journalEntry);
	
	void deleteEntry(Long entryId);
}
