package es.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author star.lee
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ESTutorialApplication {
    public static void main(String[] args) {
        SpringApplication.run(ESTutorialApplication.class, args);
    }
}
