package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app")
@PropertySource("classpath:myapp.properties")
public class MyAppConfig {

}
