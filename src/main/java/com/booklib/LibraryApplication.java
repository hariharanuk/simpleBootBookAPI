package com.booklib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.booklib.domain.Book;
import com.booklib.repo.BookRepository;

@EnableAutoConfiguration
@Configuration
@ComponentScan({""})
public class LibraryApplication {
	
	@Autowired
	BookRepository bookRepo;
	
	
	@Component
	public class DataSetup implements ApplicationRunner{

		@Override
		public void run(ApplicationArguments args) throws Exception {
			
			for (int i = 1; i <1000; i++) {
				bookRepo.save(Book.builder().title("Book-"+i).isbn("ISBN-"+(Math.random()*30+1)).build());
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
