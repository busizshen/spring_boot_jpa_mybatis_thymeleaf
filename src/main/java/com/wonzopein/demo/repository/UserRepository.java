package com.wonzopein.demo.repository;

import com.wonzopein.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by seunghyeonoh on 15. 7. 21..
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
