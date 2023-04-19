/**
 * 
 */
package com.thomasbockhorn.stoicjournal.EntryService;

import java.util.List;

import com.thomasbockhorn.stoicjournal.entity.User;

/**
 * @author thomasbockhorn
 *
 */
public interface UserService {
	
	User createEntry(User user);
	
	User getEntryById(Long userId);
	
	List<User> getAllEntries();
	
	User updateEntry(User user);
	
	void deleteEntry(Long userId);
}
