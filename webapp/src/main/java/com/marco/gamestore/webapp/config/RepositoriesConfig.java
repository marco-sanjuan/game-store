package com.marco.gamestore.webapp.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.marco.gamestore.**.infrastructure.repository"})
@EntityScan(basePackages = {"com.marco.gamestore.**.infrastructure.repository"})
public class RepositoriesConfig {
}
