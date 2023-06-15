package com.sannette.eis.mega.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class BundleConfiguration {
    @Bean
    public RouterFunction<ServerResponse> imgRouter() {
        return RouterFunctions
                .resources("/policies/**", new ClassPathResource("policies/"));
    }
}
