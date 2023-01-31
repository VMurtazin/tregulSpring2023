package ru.murtazin.spring.springintro;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    public Dog() {
        System.out.println("Собака создана");
    }

    public void say() {
        System.out.println("Gav");
    }

    public void init(){
        System.out.println("class Dog init method");
    }

    public void destroy(){
        System.out.println("class Dog destroy method");
    }
}
