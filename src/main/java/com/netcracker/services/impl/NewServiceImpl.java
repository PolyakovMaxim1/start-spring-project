package com.netcracker.services.impl;

import com.netcracker.services.SomeService;
import org.springframework.stereotype.Component;

@Component
public class NewServiceImpl implements SomeService {
    @Override
    public void doIt() {
        System.out.println("Я новая реализация, спасибо, что используете меня!!!");
    }
}
