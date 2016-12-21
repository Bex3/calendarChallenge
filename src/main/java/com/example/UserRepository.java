package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by bearden-tellez on 12/21/16.
 */
public interface  UserRepository extends CrudRepository<User, Integer>{
    User findFirstByEmailAddress (String emailAddress);
}
