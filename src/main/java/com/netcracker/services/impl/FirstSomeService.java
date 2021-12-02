package com.netcracker.services.impl;

import com.netcracker.annotation.Deprecated;
import com.netcracker.services.SomeService;
import org.springframework.stereotype.Component;

@Deprecated("com.netcracker.services.impl.NewServiceImpl")
@Component
public class FirstSomeService implements SomeService {
    @Override
    public void doIt() {
        System.out.println("Я старая реализация, не используйте меня!!!");
    }
}
