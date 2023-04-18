/**
 * 
 */
package com.thomasbockhorn.stoicjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomasbockhorn.stoicjournal.entries.JournalEntry;

/**
 * @author thomasbockhorn
 *
 */
public interface JournalRepository extends JpaRepository<JournalEntry, Long> {

}
