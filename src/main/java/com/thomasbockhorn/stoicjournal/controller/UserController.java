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

import com.thomasbockhorn.stoicjournal.EntryService.UserService;
import com.thomasbockhorn.stoicjournal.entity.JournalEntry;
import com.thomasbockhorn.stoicjournal.entity.User;

/**
 * @author thomasbockhorn
 *
 */
@RestController
@RequestMapping("api/v1/journal/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createEntry(@RequestBody User user){
		User savedEntry = userService.createEntry(user);
		return new ResponseEntity<>(savedEntry, HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
		User userEntry = userService.getEntryById(userId);
		return new ResponseEntity<>(userEntry, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllEntries(){
		List<User> userEntries = userService.getAllEntries();
		return new ResponseEntity<>(userEntries, HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<User> updateEntry(@PathVariable("id") Long userId, @RequestBody User user){
		user.setId(userId);
		User updateEntry = userService.updateEntry(user);
		return new ResponseEntity<>(updateEntry, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEntry(@PathVariable("id") Long userId){
		userService.deleteEntry(userId);
		return new ResponseEntity<>("Entry was successfuly deleted", HttpStatus.OK);
	}
}
