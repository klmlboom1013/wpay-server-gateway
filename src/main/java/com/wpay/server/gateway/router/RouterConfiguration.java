package com.wpay.server.gateway.router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfiguration {

    @Bean
    public RouteLocator ksRoute(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route("wpay-core-merchant", r -> r.path("/merchant/**").uri("lb://WPAY-CORE-MERCHANT"))
                .build();
    }
}
