package de.cblicous.smallwebfluxdemo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
* Using a router for ressource requests, just to try out the router function
*
*/
@Configuration
public class RootRouter{

	@Bean
	public  RouterFunction<?> routerFunction() {
		return RouterFunctions.route(RequestPredicates.GET("/resource"), request -> ServerResponse.ok().build());
	}


}
