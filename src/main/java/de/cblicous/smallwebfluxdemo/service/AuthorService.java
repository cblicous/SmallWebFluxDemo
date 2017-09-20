package de.cblicous.smallwebfluxdemo.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import de.cblicous.smallwebfluxdemo.dto.Author;
import reactor.core.publisher.Mono;

@Service
public class AuthorService {

	public Mono<Author> loadUserFromComplexSystem(String id){
		Author author = new Author();
		author.setId(id);
		author.setName("Test");
		author.setThumbnail("http://thumbnail.org/");
		Duration delay = Duration.ofMillis(10000);
		return Mono.justOrEmpty(author).delaySubscription(delay);
	}
}
