package com.sergio.desafio.repository;

import com.sergio.desafio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 * @author Sergio
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
