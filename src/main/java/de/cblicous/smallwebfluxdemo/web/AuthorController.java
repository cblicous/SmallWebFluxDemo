package de.cblicous.smallwebfluxdemo.web;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.cblicous.smallwebfluxdemo.dto.Author;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@GetMapping(path = "/{id}")
	public Mono<Author> get(@PathVariable("id") String id) {
		Author author = new Author();
		author.setId(id);
		author.setName("Test");
		author.setThumbnail("http://thumbnail.org/");
		
		return Mono.justOrEmpty(author);
	}
}
