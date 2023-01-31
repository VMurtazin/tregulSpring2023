package ru.murtazin.spring.springintro;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("CatBeanCreated");
    }

    @Override
    public void say() {
        System.out.println("Mau");
    }
}
