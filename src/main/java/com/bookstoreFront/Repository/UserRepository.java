package com.bookstoreFront.Repository;

import org.springframework.data.repository.CrudRepository;
 

import com.bookstoreFront.Domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

   User	findByUsername(String username);
}
