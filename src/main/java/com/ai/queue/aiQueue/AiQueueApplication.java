package com.ai.queue.aiQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan("com.ai.queue")
@EnableJpaRepositories
public class AiQueueApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AiQueueApplication.class, args);
	}

}
