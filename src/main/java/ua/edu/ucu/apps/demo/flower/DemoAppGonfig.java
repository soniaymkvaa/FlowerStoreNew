package ua.edu.ucu.apps.demo.flower;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAppGonfig {
    @Bean
    private String getData() {
        return "hello world";
    }
}
