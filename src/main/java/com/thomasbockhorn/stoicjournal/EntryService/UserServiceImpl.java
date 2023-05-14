/**
 * 
 */
package com.thomasbockhorn.stoicjournal.EntryService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.thomasbockhorn.stoicjournal.entity.User;
import com.thomasbockhorn.stoicjournal.repository.UserRepository;

/**
 * @author thomasbockhorn
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User createEntry(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getEntryById(Long userId) {
		Optional<User> optionalEntry = userRepository.findById(userId);
		return optionalEntry.get();
	}

	@Override
	public List<User> getAllEntries() {
		return userRepository.findAll();
	}

	@Override
	public User updateEntry(User user) {
		User existingUser = userRepository.findById(user.getUser_id()).get();
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setPassword(user.getPassword());
		User updatedUser = userRepository.save(existingUser);
		return updatedUser;
	}

	@Override
	public void deleteEntry(Long userId) {
		userRepository.deleteById(userId);
	}

}
