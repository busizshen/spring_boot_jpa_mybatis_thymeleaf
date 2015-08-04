package com.wonzopein.demo.repository;

import com.wonzopein.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface User repository.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
