package com.marco.gamestore.webapp.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.marco.gamestore.**.infrastructure")
@EntityScan(basePackages = {"com.marco.gamestore.**.infrastructure.repository"})
@EnableJpaRepositories(basePackages = {"com.marco.gamestore.**.infrastructure.repository"})
public class InfraConfiguration {
}
