package com.example.blogwebsite.repositories;

import com.example.blogwebsite.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
