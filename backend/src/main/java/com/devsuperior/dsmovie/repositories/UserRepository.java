/**
 * 
 */
package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dsmovie.entities.User;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
