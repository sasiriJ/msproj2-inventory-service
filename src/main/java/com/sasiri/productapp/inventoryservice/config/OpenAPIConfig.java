package com.sasiri.productapp.inventoryservice.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI inventoryServiceAPI(){
        return new OpenAPI().info(new Info().title("Inventory Service API")
                        .description("RestAPI for inventory service")
                        .version("v0.0.1")
                        .license(new License().name("MIT")))
                .externalDocs(new ExternalDocumentation()
                        .description("External Documentation links")
                        .url("https://inventory-service-dummy.com/docs")
                );
    }
}