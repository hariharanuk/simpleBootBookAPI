package com.booklib.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.booklib.domain.Book;

@RepositoryRestResource(path = "books", collectionResourceRel="books")
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

}
