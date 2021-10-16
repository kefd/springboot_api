package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.api.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
  List<Post> findByPublished(boolean published);

  List<Post> findByTitleContaining(String title);
}

// Now we can use JpaRepository’s methods: save(), findOne(), findById(), findAll(), count(), delete()
// deleteById()… without implementing these methods.

//  We also define custom finder methods:
//  – findByPublished(): returns all Tutorials with published having value as input published.
//  – findByTitleContaining(): returns all Tutorials which title contains input title.