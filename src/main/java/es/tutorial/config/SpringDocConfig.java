package es.tutorial.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

/**
 * @author star.lee
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "ElasticSearch Test", version = "v1"))
public class SpringDocConfig {
}
