/**
 * 
 */
package com.thomasbockhorn.stoicjournal.EntryService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomasbockhorn.stoicjournal.entity.JournalEntry;
import com.thomasbockhorn.stoicjournal.repository.JournalRepository;

/**
 * @author thomasbockhorn
 *
 */
@Service
public class JournalEntryServiceImpl implements EntryService {

	@Autowired
	private JournalRepository journalRepository;
	
	@Override
	public JournalEntry createEntry(JournalEntry journalEntry) {
		return journalRepository.save(journalEntry);
	}

	@Override
	public JournalEntry getEntryById(Long entryId) {
		Optional<JournalEntry> optionalEntry = journalRepository.findById(entryId);
		return optionalEntry.get();
	}

	@Override
	public List<JournalEntry> getAllEntries() {
		return journalRepository.findAll();
	}

	@Override
	public JournalEntry updateEntry(JournalEntry journalEntry) {
		JournalEntry existingEntry = journalRepository.findById(journalEntry.getEntry_id()).get();
		existingEntry.setTitle(journalEntry.getTitle());
		existingEntry.setContent(journalEntry.getContent());
		JournalEntry updatedEntry = journalRepository.save(existingEntry);
		return updatedEntry;
	}

	@Override
	public void deleteEntry(Long entryId) {
		journalRepository.deleteById(entryId);

	}

}
