package com.marco.gamestore.webapp.config;

import com.marco.gamestore.shared.domain.stereotype.Service;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        value = {"com.marco.gamestore"},
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class)
)
public class ServicesConfig {

}
