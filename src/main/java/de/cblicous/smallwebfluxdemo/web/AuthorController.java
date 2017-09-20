package de.cblicous.smallwebfluxdemo.web;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.cblicous.smallwebfluxdemo.dto.Author;
import de.cblicous.smallwebfluxdemo.service.AuthorService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired 
	private AuthorService authorService; 
	
	@GetMapping(path = "/{id}")
	public Mono<Author> get(@PathVariable("id") String id) {
		return authorService.loadUserFromComplexSystem(id);
	}
}
