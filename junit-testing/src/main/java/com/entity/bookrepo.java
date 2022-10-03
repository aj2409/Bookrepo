package com.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface bookrepo extends CrudRepository<Book, Integer> {
	public List<Book> findByName(String name);
	

}
