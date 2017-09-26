package de.cblicous.smallwebfluxdemo.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import de.cblicous.smallwebfluxdemo.dto.Author;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AuthorService.class },webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableConfigurationProperties
public class AuthorServiceTest {

	 @LocalServerPort
	 private int port;

	 
	@Autowired 
	private AuthorService service;
		
	@Test
	public void testLoadUserfromComplexSystem() {
		Mono<Author> authorResult = service.loadUserFromComplexSystem("01");
		// This is not the final stage 
		assertTrue(authorResult.block().getId().equals("01"));
		
	}
	
	
	@Test
    public void testWebTestClientWithServerURL() {
        WebTestClient.bindToServer()
            .baseUrl("http://localhost:" + port)
            .build()
            .get()
            .uri("/resource")
            .exchange()
            .expectStatus()
            .is4xxClientError()
            .expectBody();
    }

}
