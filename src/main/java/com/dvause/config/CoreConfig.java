package com.dvause.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author David Vause
 */
@Configuration
@ComponentScan(basePackages = "com.dvause")
public class CoreConfig {


}
