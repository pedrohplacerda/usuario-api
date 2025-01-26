package com.entrevista.usuario_api.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyFactory {

    @Bean
    public ObjectMapper buildObjectMapper() {
        return new ObjectMapper();
    }
}
