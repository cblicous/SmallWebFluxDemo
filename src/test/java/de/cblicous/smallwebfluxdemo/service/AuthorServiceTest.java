package de.cblicous.smallwebfluxdemo.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.cblicous.smallwebfluxdemo.dto.Author;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AuthorService.class })
@EnableConfigurationProperties
public class AuthorServiceTest {

	@Autowired 
	private AuthorService service;
		
	@Test
	public void testLoadUserfromComplexSystem() {
		Mono<Author> authorResult = service.loadUserFromComplexSystem("01");
		// This is not the final stage 
		assertTrue(authorResult.block().getId().equals("01"));
		
	}
}
