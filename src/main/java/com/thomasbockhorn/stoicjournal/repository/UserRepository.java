/**
 * 
 */
package com.thomasbockhorn.stoicjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomasbockhorn.stoicjournal.entity.User;

/**
 * @author thomasbockhorn
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
