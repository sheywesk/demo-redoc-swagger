package br.com.example.documentation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        record Logo(String url) {
        }
        return new OpenAPI()
                .info(new Info()
                        .title("Person example")
                        .description("example of api for using ReDoc and swagger")
                        .version("1.0")
                        .termsOfService("Term of use: Open Source")
                        .extensions(Collections.singletonMap("x-logo", new Logo("http://localhost:8080/logo.png")))
                        .license(new License()
                                .name("MIT")
                                .url("https://www.linkedin.com/in/sheywesk-medeiros/")
                        )
                );
    }
}
