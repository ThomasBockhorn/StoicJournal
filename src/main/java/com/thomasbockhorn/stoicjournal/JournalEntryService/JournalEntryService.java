/**
 * 
 */
package com.thomasbockhorn.stoicjournal.JournalEntryService;

import java.util.List;

import com.thomasbockhorn.stoicjournal.entries.JournalEntry;

/**
 * @author thomasbockhorn
 *
 */
public interface JournalEntryService {
	
	JournalEntry createEntry(JournalEntry journalEntry);
	
	JournalEntry getJournalEntryById(Long journalEntry);
	
	List<JournalEntry> getAllEntries();
	
	JournalEntry updateEntry(JournalEntry journalEntry);
	
	void deleteEntry(Long entryId);
}
