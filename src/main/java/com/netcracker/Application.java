package com.netcracker;

import com.netcracker.configuration.ApplicationConfiguration;
import com.netcracker.domain.Car;
import com.netcracker.services.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        CarService carServiceNew = applicationContext.getBean("carServiceNew", CarService.class);

        Car firstCar = applicationContext.getBean("firstCar", Car.class);
        Car first = applicationContext.getBean("firstCar", Car.class);
        Car secondCar = applicationContext.getBean("secondCar", Car.class);
        Car second = applicationContext.getBean("secondCar", Car.class);

//        Car test = applicationContext.getBean("carParent", Car.class);
        System.out.println(firstCar);
        System.out.println(secondCar);

        first.run();
        second.run();


        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        CarService carService = applicationContext.getBean("carService", CarService.class);

        carService.getSomeService().doIt();

        System.out.println();
    }
}
