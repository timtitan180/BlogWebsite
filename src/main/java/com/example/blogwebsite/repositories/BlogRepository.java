package com.example.blogwebsite.repositories;

import com.example.blogwebsite.entities.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Integer> {

   public void deleteById(Integer id);


}
