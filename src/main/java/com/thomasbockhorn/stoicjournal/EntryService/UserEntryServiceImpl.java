/**
 * 
 */
package com.thomasbockhorn.stoicjournal.EntryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomasbockhorn.stoicjournal.entity.JournalEntry;
import com.thomasbockhorn.stoicjournal.repository.UserRepository;

/**
 * @author thomasbockhorn
 *
 */
@Service
public class UserEntryServiceImpl implements EntryService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public JournalEntry createEntry(JournalEntry journalEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JournalEntry getEntryById(Long journalEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JournalEntry> getAllEntries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JournalEntry updateEntry(JournalEntry journalEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntry(Long entryId) {
		// TODO Auto-generated method stub

	}

}
