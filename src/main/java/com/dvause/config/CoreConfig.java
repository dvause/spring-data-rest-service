package com.dvause.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author David Vause
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.dvause")
public class CoreConfig {


}
