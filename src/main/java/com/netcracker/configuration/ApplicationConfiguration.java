package com.netcracker.configuration;

import com.netcracker.services.CarService;
import com.netcracker.services.SomeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:applicationContext.xml"})
@ComponentScan("com.netcracker")
public class ApplicationConfiguration {

    @Bean
    public CarService carServiceNew(@Qualifier("newServiceImpl") SomeService someService) {
        return new CarService("я супер-пупер сервис машин", someService);
    }
}
