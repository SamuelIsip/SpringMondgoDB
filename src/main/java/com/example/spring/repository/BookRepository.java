package com.example.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
