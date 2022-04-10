package com.hatake.getokanrisha.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class routeConfig {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        System.out.println("sup");
        return builder.routes()
                .route(p -> p
                        .path("/**")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://127.0.0.1:8080"))
                .build();
    }
}
